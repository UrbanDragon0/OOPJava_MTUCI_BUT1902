import javax.swing.*;
import java.awt.image.*;
import java.awt.*;

class JImageDisplay extends JComponent
{
    private BufferedImage displayImage;

    public JImageDisplay(int width, int height) // инициализируем объект BufferedImage новым изображением
    {
        displayImage = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);

        Dimension imageDimension = new Dimension(width, height);
        super.setPreferredSize(imageDimension); // вызываем метод setPreferredSize, чтобы все отображалось в пользовательском интерфейсе
    }

    @Override
    public void paintComponent(Graphics g) // переопредлеяем метод paintComponent
    {
        super.paintComponent(g);
        g.drawImage(displayImage, 0, 0, displayImage.getWidth(),
                displayImage.getHeight(), null);
    }

    public void clearImage() // устанавливает все пиксели изображения в черный цвет
    {
        int[] blankArray = new int[getWidth() * getHeight()];
        displayImage.setRGB(0, 0, getWidth(), getHeight(), blankArray, 0, 1);
    }

    public void drawPixel(int x, int y, int rgbColor) // устанавливает пиксель в определенный цвет
    {
        displayImage.setRGB(x, y, rgbColor);
    }
}