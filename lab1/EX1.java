public class EX1 { //Функция isPrime для проверки простоты числа
    public static boolean isPrime(int n) {
        for(int x = 2; x < n; x++){
            if(n % x == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {//функция main для перебора и вывода простых чисел с помощью isPrime
        for(int x = 2; x <= 100; x++){
            if (isPrime(x)) System.out.println(x);
        }
    }
}
