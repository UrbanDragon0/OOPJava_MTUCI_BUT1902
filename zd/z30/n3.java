// Создайте функцию, которая проверяет, является ли целое число совершенным
//числом или нет. Совершенное число - это число, которое можно записать как
//сумму его множителей, исключая само число.

public class n3
{
    public static boolean checkPerfect(int a)
    {
        int sum=0;
        boolean check=false;
        for (int i=1;i<a-1;i++)
        {
            if (a%i==0)
                sum+=i;
        }
        if (a==sum)
            check=true;
        return check;
    }

    public static void main(String[] args)
    {
        System.out.println(checkPerfect(6));
    }
}