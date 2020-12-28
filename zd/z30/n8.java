// Напишите функцию, которая возвращает самую длинную последовательность
// последовательных нулей в двоичной строке.

public class n8
{
    public static String longestZero(String n){
        String sum = "";
        String count = "";
        for (int i = 0; i < n.length()-1; i++){
            if(n.charAt(i) == '0')
                sum+="0";
            else {
                if (count.length()<sum.length())
                    count = sum;
                sum = "";
            }
        }
        if (count.length()<sum.length())count=sum;
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println();
    }
}