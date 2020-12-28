import java.util.Scanner;
class EX2{
    public static void main(String[] args){//выдает результат
        System.out.println("Enter str ");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        if (isPalindrome(in)) System.out.println("str"+in+" is palindrom");
        else System.out.println("str"+in+" is NOT palindrom");
    }

    public static boolean isPalindrome(String s){//определяет, является ли сторка палиндромом
        String rev = reverseString(s);
        if (s.equals(rev)){
            return true;
        }
        else return false;
    }

    public static String reverseString(String s){//переворачивает строку
        String rev = "";
        for (int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        return rev;
    }

}
