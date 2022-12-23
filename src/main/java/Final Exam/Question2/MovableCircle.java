package Final.Question2;

public class MovableCircle extends Movable {
    public MovableCircle(int i, int i1, int i2, int i3, int i4) {
        super();
    }

    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(10, 10, 1, 1, 5);
        System.out.println(circle);
        circle.moveDown();
        circle.moveDown();
        circle.moveRight();
        circle.moveRight();
        circle.moveUp();
        circle.moveLeft();
        circle.moveLeft();
        System.out.println(circle);
    }

    public void moveDown() {
        MovableCircle center = null;
        center.moveDown();
    }

    public void moveLeft() {
        MovableCircle center = null;
        center.moveLeft();
    }

    public void moveRight() {
        MovableCircle center = null;
        center.moveRight();
    }

    public void moveUp() {
        MovableCircle center = null;
        center.moveUp();
    }

    public String toString() {
        String radius = null;
        String center = null;
        return "radius: " + radius + ", center: " + center;

    }

}
