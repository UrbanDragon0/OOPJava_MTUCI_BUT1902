import java.awt.geom.Rectangle2D;

public class Mandelbrot extends FractalGenerator
{
    public static final int MAX_ITERATIONS = 2000; // константа с максимальным количеством операций

    public void getInitialRange(Rectangle2D.Double range) // задаем отображение правильного начального диапазона для фрактала
    {
        range.x = -2;
        range.y = -1.5;
        range.width = 3;
        range.height = 3;
    }

    public int numIterations(double x, double y) // итеративная функция для фрактала Мандельброта
    {
        int iteration = 0;

        double zreal = 0;
        double zimaginary = 0;

        while (iteration < MAX_ITERATIONS && zreal * zreal + zimaginary * zimaginary < 4)
        {
            double zrealUpdated = zreal * zreal - zimaginary * zimaginary + x; // дествительная часть числа
            double zimaginaryUpdated = 2 * zreal * zimaginary + y; // мнимая
            zreal = zrealUpdated;
            zimaginary = zimaginaryUpdated;
            iteration += 1;
        }

        if (iteration == MAX_ITERATIONS) return -1; // точка не выходит за границы

        return iteration;
    }
}