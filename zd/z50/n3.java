/* Входная строка может быть завершена, если можно добавить дополнительные
буквы, и никакие буквы не должны быть удалены, чтобы соответствовать слову.
Кроме того, порядок букв во входной строке должен быть таким же, как и порядок
букв в последнем слове.*/

public class n3
{
    public static boolean canComplite(String str1, String str2) {
        char[] massstr1 = str1.toCharArray();
        int num = 0;
        for (char c : massstr1) {
            if (str2.indexOf(String.valueOf(c), num) != -1)
                num = str2.indexOf(String.valueOf(c), num) + 1;
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(canComplite("butl", "beautiful"));
        System.out.println(canComplite("butlz", "beautiful"));
    }
}