import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.util.*;

/* Напишите функцию, которая выбирает все слова, имеющие все те же гласные (в
любом порядке и / или количестве), что и первое слово, включая первое слово.*/

public class n5
{
    public static String sameVowelGroup (String[] str) {
        String vowel = "aeiouyAEIOUY";
        StringBuilder first = new StringBuilder();
        String second = "";

        ArrayList <String> words = new ArrayList<>();
        Collections.addAll(words, str);

        for (int i = 0; i < words.get(0).length(); i++) {
            if (vowel.indexOf(words.get(0).charAt(i)) != -1)
                first.append(words.get(0).charAt(i));
        }

        for (int i = words.size() - 1; i >= 0; i--) {
            for (int j = 0; j < words.get(i).length(); j++) {
                if (vowel.indexOf(words.get(i).charAt(j)) != -1) {
                    second += words.get(i).charAt(j);
                }
            }
            for (int k = 0; k < second.length();) {
                if (first.toString().indexOf(second.charAt(k)) != -1)
                    k++;
                else {
                    words.remove(i);
                    second = "";
                }
            }
        }
        return String.valueOf(words);
    }

    public static void main(String[] args)
    {
        String[] nums = new String[] { "toe", "ocelot", "maniac"};
        System.out.println(sameVowelGroup(nums));
    }
}