/*
* Представляет отдельные вершины в
* сгенерированном пути
* */

public class Waypoint
{
    Location loc;                      // где находится путевая точка сейчас

    Waypoint prevWaypoint;             // предыдущая путевая точка


    private float prevCost;            // сколько прошел

    private float remainingCost;       // сколкьо еще осталось до цели



    public Waypoint(Location loc, Waypoint prevWaypoint)             // конструктор класса waypoint
    {
        this.loc = loc;
        this.prevWaypoint = prevWaypoint;
    }


    public Location getLocation()                                    // возвращает расплоложение путевой точки
    {
        return loc;
    }


    public Waypoint getPrevious()                                    // возвращает предыдущую точку
    {
        return prevWaypoint;
    }


    public void setCosts(float prevCost, float remainingCost)        //узнаем сколько прошли и сколько осталось
    {
        this.prevCost = prevCost;
        this.remainingCost = remainingCost;
    }


    public float getPreviousCost()                                   //стоимость зтраченного пути
    {
        return prevCost;
    }


    public float getRemainingCost()                                  //сколько осталось до конечного пункта
    {
        return remainingCost;
    }


    public float getTotalCost()                                      //сколько в целом прошел и нужно пройти
    {
        return prevCost + remainingCost;
    }
}