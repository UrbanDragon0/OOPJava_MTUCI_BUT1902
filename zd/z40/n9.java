// Создайте функцию, которая принимает два целых числа и возвращает true,
// если число повторяется три раза подряд в любом месте в num1 и то же самое
// число повторяется два раза подряд в num2.

public class n9
{
    public static boolean trouble ( long a, long b){
        String aa = Long.toString(a);
        String bb = Long.toString(b);
        int num = 0;
        for (int i = 2 ; i < aa.length(); i++) {
            if (aa.charAt(i) == aa.charAt(i -1) && aa.charAt(i) == aa.charAt(i -2))
                num = aa.charAt(i);
        }
        for (int i = 0 ; i < bb.length(); i++){
            if (bb.charAt(i)==num && bb.charAt(i+1) == num)
                return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        System.out.println(trouble ( 4519277, 411799));
        System.out.println(trouble (1222345, 12345));
    }
}