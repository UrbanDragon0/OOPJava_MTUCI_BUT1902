//Создайте функцию, которая возвращает число десятичных знаков, которое имеет
//число (заданное в виде строки). Любые нули после десятичной точки
//отсчитываются в сторону количества десятичных знаков.

public class n5
{
    public static int getDecimalPlaces(String number)
    {
        if (number.indexOf('.')!=0){
            return number.length()-number.indexOf('.')-1;
        }
        else
            return 0;
    }

    public static void main(String[] args)
    {
        System.out.println(getDecimalPlaces("234234.343535345345"));
    }
}