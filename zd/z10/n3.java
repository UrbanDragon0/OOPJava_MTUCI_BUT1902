/*
chickens = 2 legs
cows = 4 legs
pigs = 4 legs

* */

public class n3
{
    public static void animals(int a, int b, int c)
    {
        int chickens = 2 * a;
        int cows = 4 * b;
        int pigs = 4 * c;
        int s = chickens + cows + pigs;
        System.out.println(s);
    }

    public static void main(String[] args)
    {
        animals(2, 3, 5);
        animals(1, 2, 3);
        animals(5, 2, 8);
    }
}