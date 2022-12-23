//Instructions:
//        Write a Java program that implements the design described by the UML Class diagram given below.
//
//        Rectangle uml class diagram
//
//Method toString():
//        Every well-designed Java class should contain a public method called toString() that returns a short description of the instance (in a return type of String). The toString() method can be called explicitly (via instanceName.toString()) just like any other method; or implicitly through println(). If an instance is passed to the println(anInstance) method, the toString() method of that instance will be invoked implicitly.

package Week2;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return this.length;
    }
    public float getWidth() {
        return this.width;
    }
    public float getArea() {
        return this.length * this.width;
    }
    public float getPerimeter() {
        return (this.length * 2) + (this.width * 2);
    }

    public void setLength(float length) {
        this.length = length;
    }
    public void setWidth(float width) {
        this.width = width;
    }

    public String toString() {
        return "Rectangle[length="
                + this.length + ",width="
                + this.width + "]";
    }
}