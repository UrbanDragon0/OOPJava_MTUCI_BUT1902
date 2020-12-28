//Создайте функцию, которая принимает число (шаг) в качестве аргумента и
//возвращает количество полей на этом шаге последовательности.
//Шаг 0: начните с 0
//Шаг 1: Добавьте 3
//Шаг 2: Вычтите 1
//Повторите Шаги 1 И 2 ...

public class n10
{

    public static int boxSeq(int shag)
    {
        if (shag == 0) return 0;
        int count = 0;
        for (int i = 0; i < shag; i++)
        {
            if (i % 2 == 1) count--;
            else count += 3;
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println(boxSeq(2));
        System.out.println(boxSeq(1));
        System.out.println(boxSeq(0));
    }
}