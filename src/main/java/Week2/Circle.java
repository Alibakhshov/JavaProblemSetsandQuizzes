//Instructions:
//        Write a Java program that implements the design described by the UML Class diagram given below.
//
//        Circle Uml class diagram
//
//Method toString():
//        Every well-designed Java class should contain a public method called toString() that returns a short description of the instance (in a return type of String). The toString() method can be called explicitly (via instanceName.toString()) just like any other method; or implicitly through println(). If an instance is passed to the println(anInstance) method, the toString() method of that instance will be invoked implicitly.


package Week2;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }
    public String getColor() {
        return this.color;
    }
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Circle[radius="
                + this.radius + ",color="
                + this.color + "]";
    }
}