//Создайте функцию, которая повторяет каждый символ в строке n раз

public class n1 {
    public static void repeat(String word, int n) {
        String Word = " ";
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < n; j++) {
                Word += word.charAt(i);
            }
        }
        System.out.println(Word);
    }


    public static void main(String[] args) {
        repeat("asdad", 3);
    }
}