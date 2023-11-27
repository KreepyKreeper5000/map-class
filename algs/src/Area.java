import java.util.ArrayList;

public class Area {
    private String name;
    private Biome biome;
    private ArrayList<Coordinate> locs;
    public Area (String name, Biome biome, ArrayList<Coordinate> locs) {
        this.name = name;
        this.biome = biome;
        this.locs = locs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Biome getBiome() {
        return biome;
    }

    public void setBiome(Biome biome) {
        this.biome = biome;
    }

    public ArrayList<Coordinate> getLocs() {
        return locs;
    }

    public void setLocs(ArrayList<Coordinate> locs) {
        this.locs = locs;
    }
}
