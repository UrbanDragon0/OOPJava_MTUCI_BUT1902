/* Создайте функцию, которая принимает числа в качестве аргументов, складывает их
вместе и возвращает произведение цифр до тех пор, пока ответ не станет длиной
всего в 1 цифру.*/

public class n4
{
    public static int sumDigProd(int[] mass) {
        int sum = 0;
        for (int value : mass) {
            sum += value;
        }
        while (sum > 9) {
            int mult = 1;
            while (sum > 0) {
                mult *= sum % 10;
                sum /= 10;
            }
            sum = mult;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int[] nums = new int[] { 16, 28};
        System.out.println(sumDigProd(nums));
    }
}