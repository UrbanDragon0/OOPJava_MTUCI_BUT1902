/* Создайте функцию, которая принимает имя шахматной фигуры, ее положение и
целевую позицию. Функция должна возвращать true, если фигура может двигаться
к цели, и false, если она не может этого сделать.*/

public class n2
{
    public static boolean canMove(String name, String start, String end) {
        char startl = start.charAt(0);
        int startn = Integer.parseInt(String.valueOf(start.charAt(1)));
        char endl = end.charAt(0);
        int endn = Integer.parseInt(String.valueOf(end.charAt(1)));
        if (startl == endl && startn == endn) return false;
        switch (name) {
            case "Pawn": {
                if (startl == endl && startn == 2 && endn == 4)
                    return true;
                return startl == endl && endn == (startn + 1);
            }
            case "Knight": {
                return (Math.abs(startl - endl) == 2 && Math.abs(startn - endn) == 1) || (Math.abs(startl - endl) == 1 && Math.abs(startn - endn) == 2);
            }
            case "Bishop": {
                return Math.abs(startl - endl) == Math.abs(startn - endn);
            }
            case "Rook": {
                return (startl == endl && startn != endn) || (startl != endl && startn == endn);
            }
            case "Queen": {
                if ((startl == endl && startn != endn) || (startl != endl && startn == endn))
                    return true;
                if (Math.abs(startl - endl) == Math.abs(startn - endn))
                    return true;
                break;
            }
            case "King": {
                return Math.abs(startl - endl) < 2 && Math.abs(startn - endn) < 2;
            }
            default:
                return false;
        }
        return false;
    }

    public static void main(String[] args)
    {
        System.out.println(canMove("Rook", "A8", "H8") );
        System.out.println(canMove("Bishop", "A7", "G1")  );
    }
}