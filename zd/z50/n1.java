/* Пришло время отправлять и получать секретные сообщения.
Создайте две функции, которые принимают строку и массив и возвращают
закодированное или декодированное сообщение.
Первая буква строки или первый элемент массива представляет собой символьный код
этой буквы. Следующие элементы-это различия между символами: например, A +3 --> C
или z -1 --> y.*/

import java.util.*;
public class n1
{
    public static String encrypt(String str) {
        int[] mass = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (i == 0)
                mass[i] = str.charAt(i);
            else
                mass[i] += str.charAt(i) - (str.charAt(i - 1));
        }
        return Arrays.toString(mass);
    }

    public static String dycrypt(int[] mass) {
        char[] str = new char[mass.length];
        for (int i = 0; i < mass.length; i++) {
            if (i == 0) {
                str[i] = (char) mass[i];
            } else {
                str[i] = (char) (mass[i - 1] + mass[i]);
                mass[i] = mass[i - 1] + mass[i];
            }
        }
        return new String(str);
    }

    public static void main(String[] args)
    {
        System.out.println(encrypt("Hello") );
        int[] nums = new int[] { 72, 33, -73, 84, -12, -3, 13, -13, -68};
        System.out.println(dycrypt(nums));
    }
}