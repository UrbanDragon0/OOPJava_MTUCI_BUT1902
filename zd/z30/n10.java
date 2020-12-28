// Учитывая три числа, x, y и z, определите, являются ли они ребрами
// прямоугольного треугольника.


public class n10
{
    public static boolean rigthTriangle( int x, int y, int z){
        if ( x == 0 || y == 0 || z == 0 )
            return false;
        return  ( x*x+y*y==z*z || x*x==y*y+z*z || x*x+z*z == y*y);

    }

    public static void main(String[] args)
    {
        System.out.println();
    }
}