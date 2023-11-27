import java.util.ArrayList;

public class Coordinate {
    private int x;
    private int y;

    public Coordinate (int xPos, int yPos) {
        this.x = xPos;
        this.y = yPos;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void print() {
        System.out.println(x + ", " + y);
    }

    public static ArrayList<Coordinate> getArea(Coordinate start, Coordinate end) {
        ArrayList<Coordinate> locs = new ArrayList<Coordinate>();
        for (int x = start.getX(); x < end.getX(); ++x) {
            for (int y = start.getY(); y < end.getY(); ++y) {
                locs.add(new Coordinate(x, y));
            }
        }
        return locs;
    }
}
