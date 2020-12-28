// Напишите функцию, которая возвращает позицию второго вхождения " zip " в
//строку, или -1, если оно не происходит по крайней мере дважды. Ваш код должен
//быть достаточно общим, чтобы передать все возможные случаи, когда "zip" может
//произойти в строке.

public class n2
{
    public static int findZip(String strok)
    {
        int n=-1;
        for (int i=0;i<strok.length()-2;i++)
        {
            if (strok.charAt(i)=='z'&& strok.charAt(i+1)=='i'&& strok.charAt(i+2)=='p'&& n==1)
                n=i-1;
            if (strok.charAt(i)=='z'&& strok.charAt(i+1)=='i'&& strok.charAt(i+2)=='p'&& n==-1)
                n=1;

        }
        if (n==1)
            n=-1;
        return n;
    }

    public static void main(String[] args)
    {
        System.out.println(findZip("all zip files are zipped"));
    }
}