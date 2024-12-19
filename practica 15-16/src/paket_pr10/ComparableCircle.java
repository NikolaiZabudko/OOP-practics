package paket_pr10;

import paket_pr11.Circle;

public class ComparableCircle extends Circle {

    public ComparableCircle(double radius) {
        super(radius);
    }

    public boolean equals(Object obj) {
        return obj instanceof ComparableCircle && getArea() == ((ComparableCircle)obj).getArea();
    }
}