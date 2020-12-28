// Квадратное уравнение ax2 + bx + c = 0 имеет либо 0,
// либо 1, либо 2 различных
//решения для действительных значений x.
// учитывая a, b и c, вы должны вернуть
//число решений в уравнение.

public class n1
{
    public static int solutions(int a, int b, int c)
    {
        int D=b*b-4*a*c;
        if (D>0)
            return 2;
        else if (D==0)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args)
    {
        System.out.println(solutions(1, 0, -1));
        System.out.println(solutions(2, 3, 1));
        System.out.println(solutions(1, 5, -1));
    }
}