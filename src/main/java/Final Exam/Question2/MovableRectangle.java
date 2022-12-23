package Final.Question2;

public class MovableRectangle {
    public MovableRectangle(int i, int i1, int i2, int i3, int i4, int i5) {
    }

    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(10, 10, 1, 1, 5, 5);
        System.out.println(rectangle);
        rectangle.moveDown();
        rectangle.moveDown();
        rectangle.moveRight();
        rectangle.moveRight();
        rectangle.moveUp();
        rectangle.moveLeft();
        rectangle.moveLeft();
        System.out.println(rectangle);
    }

    public void moveDown() {
        MovablePoint topLeft = null;
        MovablePoint bottomRight = null;
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    public void moveLeft() {
        MovablePoint topLeft = null;
        MovablePoint bottomRight = null;
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    public void moveRight() {
        MovablePoint topLeft = null;
        MovablePoint bottomRight = null;
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public void moveUp() {
        MovablePoint topLeft = null;
        MovablePoint bottomRight = null;
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public String toString() {
        String topLeft = null;
        String bottomRight = null;
        return "topLeft: " + topLeft + ", bottomRight: " + bottomRight;
    }
}
