// Напишите функцию, которая преобразует строку в звездную стенографию.
// Если символ повторяется n раз, преобразуйте его в символ*n.

public class n7
{
    public static String toStarShorthand(String str)
    {
        int count = 1;
        char let = str.charAt(0);
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != let) {
                if (count != 1)
                    newStr += let + "*" + count;
                else
                    newStr += let;
                let = str.charAt(i);
                count = 1;
            } else
                count++;
        }
        if (count != 1)
            newStr += let + "*" + count;
        else
            newStr += let;
        return newStr;
    }

    public static void main(String[] args)
    {
        System.out.println(toStarShorthand("343444gggdfrr"));
    }
}