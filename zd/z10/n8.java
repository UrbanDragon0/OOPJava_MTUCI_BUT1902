public class n8
{
    public static void nextEdge(double b, double c)
    {
        double a = Math.sqrt(b*b + c*c - 2*b*c*Math.cos(3.12414));
        a = a - a%1;
        System.out.println(a);
    }

    public static void main(String[] args)
    {
        nextEdge(8, 10);
        nextEdge(5, 7);
        nextEdge(9, 2);
    }
}