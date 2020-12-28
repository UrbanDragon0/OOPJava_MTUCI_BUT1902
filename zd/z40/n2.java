//Напишите функцию, которая группирует строку в кластер скобок.
//Каждый кластер должен быть сбалансирован.

import java.util.*;

public class n2
{
    public static String[] split(String str) {
        List<String> list = new ArrayList<String>();
        int f = 0;
        int i = 0;
        while (str.length() > 0) {
            if (str.charAt(i) == '(') f++;
            else f--;
            if (f == 0) {
                list.add(str.substring(0, i + 1));
                str = str.substring(i + 1);
                i = 0;
                continue;
            }
            i++;
        }
        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args)
    {
        System.out.println(split("()()()"));
        System.out.println(split("((()))"));
    }
}