package Week10;

public class CD extends ToBeStored {
    private final String artist;
    private final String title;

    public CD(String artist, String title, int year) {
        super(artist, title, year);
        this.artist = artist;
        this.title = title;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return artist+": "+ title;
    }
}

