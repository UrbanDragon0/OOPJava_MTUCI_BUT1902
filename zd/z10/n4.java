public class n4
{
    public static void profitableGamble(double prob, double prize, double pay)
    {
        if ((prob * prize) > pay)
        {
            System.out.println("True");
        }
        else System.out.println("False");
    }

    public static void main(String[] args)
    {
        profitableGamble(0.2, 50, 9);
        profitableGamble(0.9, 1, 2);
        profitableGamble(0.9, 3, 2);
    }
}