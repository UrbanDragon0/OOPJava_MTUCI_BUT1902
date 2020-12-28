//Пара строк образует странную пару, если оба из следующих условий истинны:
//– Первая буква 1-й строки = последняя буква 2-й строки.
//– Последняя буква 1-й строки = первая буква 2-й строки.
//– Создайте функцию, которая возвращает true, если пара строк представляет собой
//странную пару, и false в противном случае.

public class n8
{
    public static boolean isStrangePair (String word1, String word2)
    {
        return word1.charAt(0) == word2.charAt(word2.length() - 1) &&
                word2.charAt(0) == word2.charAt(word1.length() - 1);
    }

    public static void main(String[] args)
    {
        System.out.println(isStrangePair ("ratio","orator"));
    }
}