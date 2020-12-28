/*
*Представляет карту, по которой перемещается
*алгоритм А*, включая в себя информацию о проходимости ячеек
* */

public class Map2D
{
    private int width;                              // Ширина карты
    private int height;                             // Длина карты

    private int[][] cells;                          // Массив ячеек

    private Location start;                         // Начальная точка
    private Location finish;                        // Конечня точка


    public Map2D(int width, int height)             // Конструктор класса Map2D
    {
        if (width <= 0 || height <= 0)
        {
            throw new IllegalArgumentException(
                    "width and height must be positive values; got " + width + "x" + height);
        }

        this.width = width;
        this.height = height;

        cells = new int[width][height];

        start = new Location(0, height / 2);
        finish = new Location(width - 1, height / 2);
    }


    private void checkCoords(int x, int y)          // Проверяет корректность вводимых координат
    {
        if (x < 0 || x > width)
        {
            throw new IllegalArgumentException("x must be in range [0, " + width + "), got " + x);
        }

        if (y < 0 || y > height)
        {
            throw new IllegalArgumentException("y must be in range [0, " + height + "), got " + y);
        }
    }


    public int getWidth()                           //Получаем значение ширины
    {
        return width;
    }

    public int getHeight()                          //Получаем значение высоты
    {
        return height;
    }


    public boolean contains(int x, int y)           // Проверяет координаты на соответсвие натсройкам
    {
        return (x >= 0 && x < width && y >= 0 && y < height);
    }

    public boolean contains(Location loc)
    {
        return contains(loc.xCoord, loc.yCoord);
    }

    // Запрашиваем значение ячейки
    public int getCellValue(int x, int y)
    {
        checkCoords(x, y);
        return cells[x][y];
    }

    public int getCellValue(Location loc)
    {
        return getCellValue(loc.xCoord, loc.yCoord);
    }

    // Задаем значение ячейки
    public void setCellValue(int x, int y, int value)
    {
        checkCoords(x, y);
        cells[x][y] = value;
    }


    public Location getStart()                      // Зарпашиваем начальную точку
    {
        return start;
    }

    public void setStart(Location loc)              // Задаем начальную точку
    {
        if (loc == null)
            throw new NullPointerException("loc cannot be null");

        start = loc;
    }


    public Location getFinish()                     // Запрашиваем конечную точку
    {
        return finish;
    }

    public void setFinish(Location loc)             // Задаем конечную точку
    {
        if (loc == null)
            throw new NullPointerException("loc cannot be null");

        finish = loc;
    }
}