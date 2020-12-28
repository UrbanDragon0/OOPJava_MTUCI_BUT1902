//Создайте функцию, которая принимает массив в качестве аргумента и возвращает
//true или false в зависимости от того, является ли среднее значение всех элементов
//массива целым числом или нет.

public class n3
{
    public static boolean isAvgWhole(int mass[])
    {
        double sum=0;

        for (int value : mass) {
            sum += value;
        }
        if ((sum%mass.length)%100<1)
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        int[] nums = new int[] { 1, 2, 5,  3,};
        System.out.println(isAvgWhole(nums));
    }
}