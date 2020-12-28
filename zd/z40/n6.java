
// Создайте функцию, которая принимает число и возвращает его
// мультипликативное постоянство, которое представляет собой количество раз,
// которое вы должны умножать цифры в num, пока не достигнете одной цифры.

public class n6
{
    public static int bugger(int num) {
        int count = 0;
        while (num > 9) {
            int chnum = 1;
            while (num > 0) {
                chnum *= num % 10;
                num /= 10;
            }
            num = chnum;
            count++;
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println(bugger(39));
        System.out.println(bugger(999));
        System.out.println(bugger(5));
    }
}