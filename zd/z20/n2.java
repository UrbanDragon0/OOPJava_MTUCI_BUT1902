//Создайте функцию, которая принимает массив и возвращает разницу между
//самыми большими и самыми маленькими числами.

public class n2
{
    public static void differenceMaxMin(int [] mass)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int value : mass) {
            min = Math.min(min, value);
            max = Math.max(max, value);
        }
        System.out.println(max - min);
    }


    public static void main(String[] args)
    {
        int[] nums = new int[] { 1, 2, 5,  3,};
        differenceMaxMin(nums);

    }
}