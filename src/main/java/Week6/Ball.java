//Instructions:
//        Implement all the classes using Java programming language from the given UML Class diagram.
//
//        Note: This problem requires you to submit only one class: Ball.java.
//
//        Do NOT include "public static void main()" method inside all of these classes. Graders will be testing your classes, using the unit-testing framework JUnit 4.
//
//        Ball class uml diagram
//
//        A class called Ball is designed as shown in the class diagram.
//
//        The Ball class contains the following private instance variables:
//
//        x, y and radius, which represent the ball's center (x, y) co-ordinates and the radius, respectively.
//        xDelta (Δx) and yDelta (Δy), which represent the displacement (movement) per step, in the x and y direction respectively.
//        The Ball class contains the following public methods:
//
//        A constructor which accepts x, y, radius, speed, and direction as arguments. For user friendliness, user specifies speed (in pixels per step) and direction (in degrees in the range of (-180°, 180°]). For the internal operations, the speed and direction are to be converted to (Δx, Δy) in the internal representation. Note that the y-axis of the Java graphics coordinate system is inverted, i.e., the origin (0, 0) is located at the top-left corner.
//        Java graphics png
//
//        Δx = d × cos(θ)
//        Δy = -d × sin(θ)
//
//        Hint: You will find Math.cos() and Math.toRadians(direction) static methods usefull. Don't forget that "d" is a speed.
//        Getter and setter for all the instance variables.
//        A method move() which move the ball by one step.
//        x += Δx
//        y += Δy
//        reflectHorizontal() which reflects the ball horizontally (i.e., hitting a vertical wall)
//        Δx = -Δx
//        Δy no changes
//        reflectVertical() (the ball hits a horizontal wall).
//        Δx no changes
//        Δy = -Δy
//        toString() which prints the message "Ball at (x, y) of velocity (Δx, Δy)".
//        Write and submit the Ball class.
//


package Week6;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.yDelta= (float) direction;
        this.xDelta= (float) speed ;
    }



    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        this.x+=xDelta;
        this.y+=yDelta;
    }

    public void reflectHorizontal(){
        xDelta=(-xDelta);
    }

    public void reflectVertical(){
        yDelta=(-yDelta);
    }

    @Override
    public String toString() {
        return "Ball[x=" +
                + x +
                ",y=" + y +
                ",speed=("+ (int) xDelta +
                ","+ (int) yDelta +
                ")]";
    }
}
