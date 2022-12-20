package Final.Question2;

public class Movable {
    public void moveUp() {
        System.out.println("move up");
    }

    public void moveDown() {
        System.out.println("move down");
    }

    public void moveLeft() {
        System.out.println("move left");
    }

    public void moveRight() {
        System.out.println("move right");
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


}
