package paket_pr11;

import paket_pr10.GeometricObject;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            return this.radius == other.radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Круг с радиусом " + radius + ", площадь: " + getArea() + ", периметр: " + getPerimeter();
    }
}
