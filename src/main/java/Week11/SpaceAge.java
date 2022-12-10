package Week11;

public class SpaceAge {
    private double seconds;

    public SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    public double getSeconds() {
        return seconds;
    }

    public double onEarth() {
        return seconds / 31557600;
    }

    public double onMercury() {
        return onEarth() / 0.2408467;
    }

    public double onVenus() {
        return onEarth() / 0.61519726;
    }

    public double onMars() {
        return onEarth() / 1.8808158;
    }

    public double onJupiter() {
        return onEarth() / 11.862615;
    }

    public double onSaturn() {
        return onEarth() / 29.447498;
    }

    public double onUranus() {
        return onEarth() / 84.016846;
    }

    public double onNeptune() {
        return onEarth() / 164.79132;
    }
}
