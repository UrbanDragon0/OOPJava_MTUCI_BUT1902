// Индекс массы тела (ИМТ) определяется путем измерения вашего веса
// в килограммах и деления на квадрат вашего роста в метрах.
// Категории ИМТ таковы:
// Недостаточный вес: <18,5
// Нормальный вес: 18.5-24.9
// Избыточный вес: 25 и более Создайте функцию, которая будет принимать вес
// и рост (в килограммах, фунтах, метрах или дюймах)
// и возвращать ИМТ и связанную с ним категорию.
// Округлите ИМТ до ближайшей десятой.


public class n5
{
    public static String BMI(String[] fat) {
        double ves = Double.parseDouble(fat[0].split(" ")[0]);
        double rost = Double.parseDouble(fat[1].split(" ")[0]);
        String out = " ";
        if (fat[0].contains("kg"))
            ves = ves * 0.45;
        if (fat[1].contains("mt"))
            rost *= 0.0254;
        double BMI = Math.round((ves / (rost * rost)) * 10.0) / 10.0;
        if (BMI < 18.5)
            out = BMI + "Underweight";
        if (BMI >= 18.5 && BMI <= 24.9)
            out = BMI + " Normal weight";
        if (BMI > 25)
            out = BMI + "Overweight";
        return out;
    }

    public static void main(String[] args)
    {
        String[] nums = new String[] {"205 kg", "73 mt"};
        System.out.println(BMI(nums));
    }
}