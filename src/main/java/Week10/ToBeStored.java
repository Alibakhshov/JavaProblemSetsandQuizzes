package Week10;

public class ToBeStored implements Comparable<ToBeStored> {
    private final String artist;
    private final String title;
    private final int year;

    public ToBeStored(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    public double weight() {
        return 0;
    }

    @Override
    public String toString() {
        return artist+": "+ title+" ("+year+")";
    }

    @Override
    public int compareTo(ToBeStored o) {
        if (this.weight() == o.weight()) {
            return 0;
        } else if (this.weight() > o.weight()) {
            return 1;
        } else {
            return -1;
        }
    }
}

