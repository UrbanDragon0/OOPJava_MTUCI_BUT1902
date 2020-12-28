public class n6
{
    public static void ctoa(char a)
    {
        char character = a;
        int ascii = (int) character;
        System.out.println(ascii);
    }

    public static void main(String[] args)
    {
        ctoa('A');
        ctoa('m');
        ctoa('[');
    }
}