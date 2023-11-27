import java.util.*;

public class Map {
    private int sizeX;
    private int sizeY;
    private ArrayList<Area> areas;

    public Map () {
        this.areas = new ArrayList<Area>();
        this.sizeX = 10;
        this.sizeY = 10;
        ArrayList<Coordinate> locs = Coordinate.getArea(new Coordinate(0, 0), new Coordinate(sizeX, sizeY));
        this.areas.add(new Area("Grassy Field", Biome.PLAINS, locs));
    }
}
