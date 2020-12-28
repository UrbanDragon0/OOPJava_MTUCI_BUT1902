public class n5
{
    public static void operation(int N, int a, int b)
    {
        if (N == (a + b)) System.out.println("+");
        else if (N == (a - b)) System.out.println("-");
        else if (N == (a * b)) System.out.println("*");
        else if (N == (a / b)) System.out.println("/");
        else System.out.println("None");
    }

    public static void main(String[] args)
    {
        operation(24, 15, 9);
        operation(24, 26, 2);
        operation(15, 11, 11);
    }
}