// Предположим, что пара одинаковых символов служит концами книги
// для всех символов между ними.Напишите функцию,
// которая возвращает общее количество уникальных символов
// (книг, так сказать) между всеми парами концов книги.
import java.util.*;

public class n10
{
    public static int countUniqueBooks(String str, char c){
        Map<Character, Integer> values = new HashMap<>();
        boolean start = true;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == c && start) {
                i++;
                while (str.charAt(i) != c){
                    Integer n = values.get(str.charAt(i));
                    if (n == null)
                        values.put(str.charAt(i), 1);
                    else
                        values.put(str.charAt(i), ++n);
                    i++;
                }
                start = false;
            }
            if (str.charAt(i) == c)
                start = true;
        }
        return values.size();
    }

    public static void main(String[] args)
    {
        System.out.println(countUniqueBooks("AZYWABBCATTTA", 'A'));
        System.out.println(countUniqueBooks("$AA$BBCATT$C$$B$", '$'));
        System.out.println(countUniqueBooks("ZZABCDEF", 'Z'));
    }
}