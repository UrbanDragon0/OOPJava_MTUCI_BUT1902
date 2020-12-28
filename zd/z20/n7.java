//Почтовые индексы состоят из 5 последовательных цифр. Учитывая строку,
//напишите функцию, чтобы определить, является ли вход действительным
//почтовым индексом. Действительный почтовый индекс выглядит следующим
//образом:
//– Должно содержать только цифры (не допускается использование нецифровых цифр).
//– Не должно содержать никаких пробелов.
//– Длина не должна превышать 5 цифр.

public class n7
{
    public static boolean isValid(String index){
        int buf = 0;
        for (int i = 0; i < index.length(); i++) {
            if (!Character.isDigit(index.charAt(i)))
                buf++;
            else if (index.charAt(i) == ' ')
                buf++;
            else if (index.length() != 5)
                buf++;
        }
        return buf == 0;
    }

    public static void main(String[] args)
    {
        System.out.println(isValid("55555"));
        System.out.println(isValid("555675"));
        System.out.println(isValid("55dws555"));
    }
}