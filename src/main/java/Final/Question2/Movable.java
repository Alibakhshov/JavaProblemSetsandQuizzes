package Final.Question2;

public class Movable {
public static void main(String[] args) {
        MovablePoint point = new MovablePoint(10, 10, 1, 1);
        System.out.println(point);
        point.moveDown();
        point.moveDown();
        point.moveRight();
        point.moveRight();
        point.moveUp();
        point.moveLeft();
        point.moveLeft();
        System.out.println(point);
    }
}
