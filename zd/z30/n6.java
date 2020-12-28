// Напишите функцию, которая возвращает true, если два массива имеют одинаковое
// количество уникальных элементов, и false в противном случае.
import java.util.Arrays;
public class n6
{
    public static boolean same(int [] mass, int[] mass1) {
        int count = 0;
        int count1 = 0;
        boolean same = false;
        Arrays.sort(mass);
        Arrays.sort(mass1);
        for (int i=0;i<mass.length-1;i++){
            if (mass[i]!=mass[i+1])
                count++;
        }
        for (int i=0;i<mass1.length-1;i++){
            if (mass1[i]!=mass1[i+1])
                count1++;
        }
        if (count == count1)
            same = true;
        return same;

    }

    public static void main(String[] args)
    {
        System.out.println();
    }
}