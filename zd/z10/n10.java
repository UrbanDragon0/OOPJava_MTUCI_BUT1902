public class n10
{
    public static void abcmath(int a, int b, int c)
    {
        for (int i = 0; i<b ; i++)
        {
            a=a+a;
        }
        if (a % c == 0)  System.out.println(true);
        else System.out.println(false);
    }

    public static void main(String[] args)
    {
        abcmath(5, 2, 1);
        abcmath(1, 2, 3);
        abcmath(42, 5, 10);
    }
}