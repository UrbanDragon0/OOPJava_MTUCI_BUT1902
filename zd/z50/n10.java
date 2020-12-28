/* Как указано в онлайн-энциклопедии целочисленных последовательностей:
Гексагональная решетка - это привычная двумерная решетка, в которой каждая точка
имеет 6 соседей.
Центрированное шестиугольное число - это центрированное фигурное число,
представляющее шестиугольник с точкой в центре и всеми другими точками,
окружающими центральную точку в шестиугольной решетке.
Напишите функцию, которая принимает целое число n и возвращает "недопустимое",
если n не является центрированным шестиугольным числом или его иллюстрацией
в виде многострочной прямоугольной строки в противном случае.
*/
import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;
public class n10
{
    public static String haxLattice(int n){
        int num = 1;
        int i = 1;
        String res="";
        String str2="";
        while (n>num) {
            i++;
            num = 3 * i * (i - 1) + 1;
        }
        int l = i;
        // верхняя половина
        if (n != num)
            res = "invalid";
        else {
            while (l < i * 2 - 1) {
                for (int a = 0; a < i * 2 - 1 - l; a++)
                    res += "  ";
                for (int b = 0; b < l; b++)
                    res += " o  ";
                res += "\n";
                l++;
            }
            // нижняя половина
            while (l >= i) {
                for (int a = 0; a < i * 2 - 1 - l; a++)
                    res += "  ";
                for (int b = l; b > 0; b--)
                    res += " o  ";
                res += "\n";
                l--;
            }
        }
        return res;
    }


    public static void main(String[] args)
    {
        System.out.println(hexLattice(1));
        System.out.println(hexLattice(19));
        System.out.println(hexLattice(2));
    }
}