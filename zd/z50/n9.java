/* Напишите функцию, которая принимает строку и возвращает строку с правильным
регистром для заголовков символов в серии "Игра престолов".
Слова and, the, of и in должны быть строчными. Все остальные слова должны иметь
первый символ в верхнем регистре, а остальные-в Нижнем.*/

import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.*;

public class n9
{
    public static String correctTitle(String title) {
        String[] text = title.toLowerCase().split(" ");
        title = "";
        String pos = "";
        for (int i = 0; i < text.length; i++) {
            while (text[i].contains("-")) {
                pos += text[i].indexOf("-") + " ";
                text[i] = text[i].substring(0, text[i].indexOf("-")) + " " + text[i].substring(text[i].indexOf("-") + 1);
                System.out.println(text[i].substring(text[i].indexOf("-") + 1));
            }
            if (text[i].equals("in") || text[i].equals("of") || text[i].equals("and") || text[i].equals("the"))
                title += text[i].toLowerCase() + " ";
            else
                title += text[i].substring(0, 1).toUpperCase() + text[i].substring(1) + " ";
        }
        return title;
    }

    public static void main(String[] args)
    {
        System.out.println(correctTitle("jOn SnoW, kINg IN thE noRth."));
        System.out.println(correctTitle("sansa stark, lady of winterfell."));
        System.out.println(correctTitle("TYRION LANNISTER, HAND OF THE QUEEN."));
    }
}