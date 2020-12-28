/*Напишите функцию, которая принимает основание
* и высоту треугольника и возвращает его площадь.
* */

public class n2
{
    public static void triArea(int a, int b)
    {
        System.out.println((a * b)/2);
    }

    public static void main(String[] args)
    {
        triArea(3, 2);
        triArea(7, 4);
        triArea(10, 10);
    }
}