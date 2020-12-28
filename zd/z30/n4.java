//Создайте функцию, которая принимает строку и возвращает новую строку с
//заменой ее первого и последнего символов, за исключением трех условий:
//– Если длина строки меньше двух, верните "несовместимо".".
//– Если первый и последний символы совпадают, верните "два-это пара.".

public class n4
{
    public static String flipEndChars(String str)
    {
        char [] buf;
        if(str.length()<2)
            str="Two's a pair.";
        else if (str.charAt(0)==str.charAt(str.length()-1))
        {
            str="Incompatible.";
        }
        else if(!((str == "Two's a pair.") || (str == "Incompatible.")))
        {
            buf = str.toCharArray();
            buf[0]=str.charAt(str.length()-1);
            buf[str.length()-1]=str.charAt(0);
            str=new String(buf);
        }
        return str;
    }

    public static void main(String[] args)
    {
        System.out.println();
    }
}