package paket;

public class TestShape {
    public static void main(String[] args) {
        // Создаем объекты Circle, Rectangle и Square
        Shape circle = new Circle(5.0, "blue", false);
        Shape rectangle = new Rectangle(2.0, 4.0, "green", true);
        Shape square = new Square(3.0, "yellow", false);

        // Тестирование методов
        System.out.println(circle); // Полиморфизм
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());

        System.out.println(rectangle); // Полиморфизм
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        System.out.println(square); // Полиморфизм
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }
}
