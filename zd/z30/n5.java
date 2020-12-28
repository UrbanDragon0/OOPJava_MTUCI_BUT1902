// Создайте функцию, которая определяет, является ли строка допустимым
// шестнадцатеричным кодом

public class n5
{
    public static boolean isValidHexCode(String code)
    {

        if (code.length() > 7) return false;

        else if (code.matches("#[a-fA-F0-9]+")) return true;

        else return false;
    }

    public static void main(String[] args)
    {
        System.out.println(isValidHexCode("#CD5C5C"));
    }
}