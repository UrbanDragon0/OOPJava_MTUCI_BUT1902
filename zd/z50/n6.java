/* Создайте функцию, которая принимает число в качестве аргумента и возвращает
 true, если это число является действительным номером кредитной карты, а в
 противном случае-false.
 Номера кредитных карт должны быть длиной от 14 до 19 цифр и проходить тест Луна, описанный ниже:
– Удалите последнюю цифру (это"контрольная цифра").
– Переверните число.
– Удвойте значение каждой цифры в нечетных позициях. Если удвоенное значение имеет более 1 цифры, сложите цифры вместе (например, 8 x 2 = 16 ➞ 1 + 6 = 7).
– Добавьте все цифры.
– Вычтите последнюю цифру суммы (из шага 4) из 10. Результат должен быть равен контрольной цифре из Шага 1.

 */

public class n6
{
    public static boolean validateCard(long cardNum) {
        StringBuilder str= new StringBuilder();
        if ( Long.toString(cardNum).length()>= 14 && Long.toString(cardNum).length() <= 19) {
            // step 1
            long lastNum = cardNum%10;
            StringBuilder cardNumStr = new StringBuilder(Long.toString(cardNum/=10));
            // step 2
            cardNumStr.reverse();
            // step 3
            for (int i = 0; i< cardNumStr.length(); i++){
                if (i%2==0){
                    int c =Character.getNumericValue(cardNumStr.charAt(i))*2;
                    if(c>9){
                        String buf = Integer.toString(c);
                        str.append(Character.getNumericValue(buf.charAt(0)) + Character.getNumericValue(buf.charAt(1)));
                    }
                    else str.append(c);
                }
                else str.append(cardNumStr.charAt(i));
            }
            System.out.println(str);
            int sum=0;
            for (int i=0;i<str.length();i++)
                sum+=Character.getNumericValue(str.charAt(i));
            System.out.println(sum);
            System.out.println(lastNum);
            return lastNum == 10 - sum % 10;
        }
        return false;
    }

    public static void main(String[] args)
    {
        System.out.println(validateCard(123456));
    }
}