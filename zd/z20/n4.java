//Создайте метод, который берет массив целых чисел и возвращает массив, в
//котором каждое целое число является суммой самого себя + всех предыдущих
//чисел в массиве.

public class n4
{
    public static int[] cumulativeSum( int [] mass){

        for (int i = 1; i < mass.length; i++){
            mass[i] = mass[i] + mass[i-1];
        }
        return mass;
    }

    public static void main(String[] args)
    {
        int[] nums = new int[] { 1, 2, 5,  3,};
        System.out.println(cumulativeSum(nums));
    }
}