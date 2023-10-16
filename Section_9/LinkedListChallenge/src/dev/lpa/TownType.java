package dev.lpa;

public class TownType {
    private String name;
    private long distance;

    public TownType(String name, long distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "TownType {" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                '}';
    }
}

