//Создайте функцию, которая при заданном числе возвращает соответствующее
//число Фибоначчи.

public class n6
{
    public static int Fibonacci (int n){
        switch (n) {
            case 0:
            case 1:
                return 1;
            default:
                return Fibonacci(n - 2) + Fibonacci(n - 1);
        }
    }

    public static void main(String[] args)
    {
        System.out.println(Fibonacci (7));
    }
}