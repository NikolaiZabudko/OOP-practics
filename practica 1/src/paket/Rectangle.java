package paket;

public class Rectangle {
    double width;
    double height;

    public Rectangle() {
        this.width = -1; // Значение по умолчанию для ширины
        this.height = -1; // Значение по умолчанию для высоты
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

