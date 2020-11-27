import java.util.Scanner;

public class Point3d extends Point2d {

    private double zCoord; //Переменная Z

    public Point3d(double x, double y, double z) { //Задаем переменные
        zCoord = z;
    }
    public Point3d() {    //Если аргументов нет
        this(0, 0, 0);
    }

    public double getZ() {   //Получаем Z
        return zCoord;
    }
    public void setZ(double z) {  //Задаем Z
        zCoord = z;
    }

    public static boolean Coordinator(Point3d a, Point3d b) {    //Сравниваем точки
        return (a.getX() == b.getX()) && (a.getY() == b.getY()) && (a.getZ() == b.getZ());
    }
    public static double distanceTo(Point3d a, Point3d b)       //Находим расстояние между ними
    {
        double R = Math.sqrt((b.getX()-a.getX())*(b.getX()-a.getX()) + (b.getY()-a.getY())*(b.getY()-a.getY()) + (b.getZ()-a.getZ())*(b.getZ()-a.getZ()));
        R *= 100;          //Округляем до двух знаков после запятой
        R = (int) R;
        return (R / 100);
    }

    //Проверяем работоспособность
    /*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x y z: " + "\n"); //Вводим данные для первой точки
        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();
        System.out.print("Enter x1 y1 x1: " + "\n"); //Вводим данные для второй точки
        double a1 = in.nextInt();
        double b1 = in.nextInt();
        double c1 = in.nextInt();
        Point3d Point = new Point3d(a,b,c); //Создаем точки
        Point3d Point1 = new Point3d(a1,b1,c1);

        //Задаем данные
        Point.setX(a); //задаем X
        Point1.setX(a1);

        Point.setY(b);  //Задаем Y
        Point1.setY(b1);

        Point.setZ(b);   //Задаем Z
        Point1.setZ(b1);

        in.close();  //После чего отключаем модуль Scanner

        if(Coordinator(Point, Point1)) System.out.println("Points have equal coordinates");
        else {
            System.out.println("Points have different coordinates.");//Если расстояние разное
            System.out.println("Distance between points: "); //Рассчитываем дистанцию
            System.out.print(distanceTo(Point, Point1));
        }
    }
    */
}