//Создайте две функции: isPrefix(word, prefix-) и isSuffix (word, -suffix).
//– isPrefix должен возвращать true, если он начинается с префиксного аргумента.
//– isSuffix должен возвращать true, если он заканчивается аргументом суффикса.
//– В противном случае верните false.

public class n9
{
    public static boolean isPrefix(String word, String pref)
    {
        pref =  pref.substring(0,  pref.length()-1);
        return word.startsWith(pref);
    }

    public static boolean isSuffix(String word, String suf)
    {
        suf = suf.substring(1);
        return word.endsWith(suf);
    }

    public static void main(String[] args)
    {
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
    }
}