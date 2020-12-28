// Создайте функцию, которая возвращает true,
// если две строки рифмуются, и false в противном случае.
// Для целей этого упражнения две строки рифмуются,
// если последнее слово из каждого предложения содержит одни и те же гласные.

public class n8
{
    public static boolean doesRhyme(String str1, String str2) {
        str1 = str1.substring(str1.lastIndexOf(" ") + 1);
        str2 = str2.substring(str2.lastIndexOf(" ") + 1);
        String let = "aeiouyAEIOUY";
        String res1 = "", res2 = "";
        for (int i = 0; i < str1.length(); i++) {
            if (let.indexOf(str1.charAt(i)) != -1)
                res1 += str1.charAt(i);
        }
        for (int i = 0; i < str2.length(); i++) {
            if (let.indexOf(str2.charAt(i)) != -1)
                res2 += str2.charAt(i);
        }
        if (res1.toLowerCase().equals(res2.toLowerCase())) return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));
        System.out.println(doesRhyme("You are off to the races", "a splendid day."));
    }
}