/*
class Lab2{ // Класс Lab2 для проверки написания кода
    public static void main(String[] args){
        //Создаем несколько объектов для сравнения
        Point2d Point1 = new Point2d(1, 1);
        Point2d Point2 = new Point2d(1, 1);
        Point2d Point3 = new Point2d(4, 3);
//
        if (Point1.Coordinator(Point1, Point2) == true)
            System.out.println("Point1 == Point2");
        if (Point1.Coordinator(Point1, Point3) == false)
            System.out.println("Point1 != Point3");
    }
}
*/

public class Point2d {
    private double xCoord; // Координаты X и Y
    private double yCoord;

    // Конструктор инициализации
    public Point2d ( double x, double y) {
        xCoord = x;
        yCoord = y;
    }
    public Point2d () {
        this(0,0);
    }

    // Возвращение значений координат
    public double getX () {
        return xCoord;
    }
    public double getY () {
        return yCoord;
    }

    // Задание значений координат
    public void setX ( double val) {
        xCoord = val;
    }
    public void setY ( double val) {
        yCoord = val;
    }

    //Сравниваем значения точек
    public static boolean Coordinator(Point2d a, Point2d b){
        if ((a.getX() == b.getX()) && (a.getY() == b.getY()))
            return true;
        else
            return false;
    }
}

