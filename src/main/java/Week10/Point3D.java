package Week10;

public class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double distance(Point3D point) {
        return Math.sqrt(Math.pow(point.getX() - this.getX(), 2) + Math.pow(point.getY() - this.getY(), 2) + Math.pow(point.getZ() - this.z, 2));
    }

    public double distance(double x, double y, double z) {
        return Math.sqrt(Math.pow(x - this.getX(), 2) + Math.pow(y - this.getY(), 2) + Math.pow(z - this.z, 2));
    }

    public double distance() {
        return Math.sqrt(Math.pow(0 - this.getX(), 2) + Math.pow(0 - this.getY(), 2) + Math.pow(0 - this.z, 2));
    }

    public static double distance(Point3D point1, Point3D point2) {
        return Math.sqrt(Math.pow(point2.getX() - point1.getX(), 2) + Math.pow(point2.getY() - point1.getY(), 2) + Math.pow(point2.getZ() - point1.z, 2));
    }

    @Override
    public String toString() {
        return "(" + this.getX() + ", " + this.getY() + ", " + z + ")";
    }
}

