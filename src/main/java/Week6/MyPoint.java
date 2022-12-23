//Instructions:
//        A class called MyPoint, which models a 2D point with x and y coordinates, is designed as shown in the class diagram.
//
//        Note: For this problem do not add "public static void main()" method.
//
//
//
//        It contains:
//
//        Two instance variables x (int) and y (int).
//        A default (or "no-argument" or "no-arg") constructor that construct a point at the default location of (0, 0).
//        A overloaded constructor that constructs a point with the given x and y coordinates.
//        Getter and setter for the instance variables x and y.
//        A method setXY() to set both x and y.
//        A method getXY() which returns the x and y in a 2-element int array.
//        A toString() method that returns a string description of the instance in the format "(x, y)".
//        A method called distance(int x, int y) that returns the distance from this point to another point at the given (x, y) coordinates, e.g.,
//        MyPoint p1 = new MyPoint(3, 4);
//        System.out.println(p1.distance(5, 6));
//        An overloaded distance(MyPoint another) that returns the distance from this point to the given MyPoint instance (called another), e.g.,
//        MyPoint p1 = new MyPoint(3, 4);
//        MyPoint p2 = new MyPoint(5, 6);
//        System.out.println(p1.distance(p2));
//        Another overloaded distance() method that returns the distance from this point to the origin (0,0), e.g.,
//        MyPoint p1 = new MyPoint(3, 4);
//        System.out.println(p1.distance());
//        You are required to:
//
//        Write the code for the class MyPoint.
//
//
//// Test program to test all constructors and public methods
//        MyPoint p1 = new MyPoint();  // Test constructor
//        System.out.println(p1);      // Test toString()
//        p1.setX(8);   // Test setters
//        p1.setY(6);
//        System.out.println("x is: " + p1.getX());  // Test getters
//        System.out.println("y is: " + p1.getY());
//        p1.setXY(3, 0);   // Test setXY()
//        System.out.println(p1.getXY()[0]);  // Test getXY()
//        System.out.println(p1.getXY()[1]);
//        System.out.println(p1);
//
//        MyPoint p2 = new MyPoint(0, 4);  // Test another constructor
//        System.out.println(p2);
//// Testing the overloaded methods distance()
//        System.out.println(p1.distance(p2));    // which version?
//        System.out.println(p2.distance(p1));    // which version?
//        System.out.println(p1.distance(5, 6));  // which version?
//        System.out.println(p1.distance());      // which version?
//
//        Instructions for optional part:
//        Write a program that allocates 10 points in an array of MyPoint, and initializes to (1, 1), (2, 2), ... (10, 10).
//        Hints: You need to allocate the array, as well as each of the 10 MyPoint instances.  In other words, you need to issue 11 new, 1 for the array and 10 for the MyPoint instances.
//        MyPoint[] points = new MyPoint[10];  // Declare and allocate an array of MyPoint
//        for (int i = 0; i < points.length; i++) {
//        points[i] = new MyPoint(...);    // Allocate each of MyPoint instances
//        }
//// use a loop to print all the points
//        Notes: Point is such a common entity that JDK certainly provided for in all flavors.
//


        package Week6;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public MyPoint() {
        this.x = 0;
        this.y = 0;
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

    public int[] getXY() {
        return new int[]{this.x, this.y};
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x +
                "," + y +
                ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
    }
    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
}
