import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab1 extends Point3d {

    public static double computerArea(Point3d a, Point3d b, Point3d c) { //находим площадь
        double Side1 = distanceTo(a, b), Side2 = distanceTo(a, c), Side3 = distanceTo(c, b);
        double per = (Side1 + Side2 + Side3) / 2;
        return Math.sqrt(per * (per - Side1) * (per - Side2) * (per - Side3));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter x y z: " + "\n");
        double a = in.nextInt();
        double b = in.nextInt();
        double c = in.nextInt();
        System.out.print("Enter x1 y1 z1: " + "\n");
        double a1 = in.nextInt();
        double b1 = in.nextInt();
        double c1 = in.nextInt();
        System.out.print("Enter x2 y2 z2: " + "\n");
        double a2 = in.nextInt();
        double b2 = in.nextInt();
        double c2 = in.nextInt();

        Point3d Point = new Point3d(a,b,c);
        Point3d Point1 = new Point3d(a1,b1,c1);
        Point3d Point2 = new Point3d(a2,b2,c2);
        in.close();

        Point.setX(a);
        Point1.setX(a1);
        Point2.setX(a2);

        Point.setY(b);
        Point1.setY(b1);
        Point2.setY(b2);

        Point.setZ(c);
        Point1.setZ(c1);
        Point2.setZ(c2);

        if((computerArea(Point, Point1, Point2) == 0) || Coordinator(Point, Point2) || Coordinator(Point2, Point1) || Coordinator(Point, Point1)){
            if (computerArea(Point, Point1, Point2) == 0){
                System.out.println("All points lie on the same straight line.");
            }
            System.out.println("The triangle doesn't exist.");
        }
        else{
            System.out.println("Area of the triangle: ");
            System.out.print(computerArea(Point, Point1, Point2));
        }
    }
}