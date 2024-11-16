package paket;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 5, 10);
        System.out.println("Initial Point: " + point);
        point.moveUp();
        System.out.println("After moving up: " + point);
        point.moveRight();
        System.out.println("After moving right: " + point);

        MovableCircle circle = new MovableCircle(0, 0, 5, 5, 10);
        System.out.println("Initial Circle: " + circle);
        circle.moveDown();
        System.out.println("After moving down: " + circle);
        circle.moveLeft();
        System.out.println("After moving left: " + circle);
    }
}