//Создайте две функции toCamelCase () и toSnakeCase (),
// каждая из которых берет одну строку и преобразует ее либо
// в camelCase, либо в snake_case.

public class n3
{
    public static String toCamelCase(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == '_')
                str = str.substring(0, i) + str.substring(i + 1, i + 2).toUpperCase() + str.substring(i + 2, str.length());
        }
        return str;
    }


    public static String toSnakeCase(String str) {
        return str.replaceAll("([A-Z])", "_$0").toLowerCase();
    }

    public static void main(String[] args)
    {
        System.out.println(toCamelCase("For_The_Emperer"));
        System.out.println(toSnakeCase(toCamelCase("For_The_Emperer")));
    }
}