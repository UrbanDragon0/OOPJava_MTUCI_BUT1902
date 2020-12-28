import java.util.*;

public class AStarState
{
    private Map2D map;
    private Map<Location, Waypoint> Opened = new java.util.HashMap<Location, Waypoint>();
    private Map<Location, Waypoint> Closed = new java.util.HashMap<Location, Waypoint>();

    public AStarState(Map2D map)
    {
        if (map == null)
            throw new NullPointerException("map cannot be null");
        this.map = map;
    }

    public Map2D getMap()
    {
        return map;
    }

    public Waypoint getMinOpenWaypoint() //Эта функция должна проверить все вершины в наборе открытых вершин
    {
        if (Opened.size() == 0) return null;
        ArrayList<Waypoint> waypoints = new ArrayList<Waypoint>(Opened.values());
        float mincost = waypoints.get(0).getTotalCost();
        Waypoint min = waypoints.get(0);
        for (int i = 1; i < waypoints.size(); i++) {
            if (waypoints.get(i).getTotalCost() < mincost) {
                min = waypoints.get(i);
                mincost = min.getTotalCost();
            }
        }
        return min;
    }

    public boolean addOpenWaypoint(Waypoint newWP) // заменяет старый путь на новый
    {
        if (Opened.get(newWP.getLocation()) == null )
        {
            Opened.put(newWP.getLocation(), newWP);
            return true;
        }
        else
        {
            if (Opened.get(newWP.getLocation()).getPreviousCost() >
                    newWP.getPreviousCost()) {
                Opened.put(newWP.getLocation(), newWP);
                return true;
            }
        }
        return false;
    }

    public int numOpenWaypoints() //Этот метод возвращает количество точек в наборе открытых вершин
    {
        return Opened.size();
    }

    public void closeWaypoint(Location loc)  //перемещает вершину из откртых в закрытые
    {
        Closed.put(loc, Opened.remove(loc));
    }

    public boolean isLocationClosed(Location loc) //возвращает true если вершина закрытая
    {
        if (Closed.containsKey(loc)) return true;
        return false;
    }
}
