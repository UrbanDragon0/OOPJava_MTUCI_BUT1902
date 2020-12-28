/*В Java есть единственный оператор, способный обеспечить остаток от операции
* деления. Два числа передаются в качестве параметров. Первый параметр, разделенный
* на второй параметр, будет иметь остаток, возможно, ноль. Верните это значение.
* */

public class n1
{
    public static void Remainder(int a, int b)
    {
        System.out.println(a % b);
    }

    public static void main(String[] args)
    {
        Remainder(1, 3);
        Remainder(3, 4);
        Remainder(-9, 45);
        Remainder(5, 5);
    }
}