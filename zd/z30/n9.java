// Если задано целое число, создайте функцию, которая возвращает следующее
// простое число. Если число простое, верните само число.

public class n9
{
    public static int nextPrime(int num){
        while(true){
            boolean check=true;
            for(int i=2;i<=num/2;i++){
                if (num % i == 0) {
                    num++;
                    check=false;
                }
            }
            if (check) break;
        }
        return num;
    }

    public static void main(String[] args)
    {
        System.out.println();
    }
}