package paket;

public class Main {
    public static void main(String[] args) {

        Circle[] circleArray = new Circle[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle(Math.random() * 100);
        }


        Circle largestCircle = findLargestCircle(circleArray);
        System.out.println("Круг с самой большой площадью: Радиус = " + largestCircle.getRadius() +
                ", Площадь = " + largestCircle.getArea());
    }

    /** Находит круг с наибольшей площадью в массиве circleArray */
    public static Circle findLargestCircle(Circle[] circleArray) {
        Circle largest = circleArray[0];
        for (Circle circle : circleArray) {
            if (circle.getArea() > largest.getArea()) {
                largest = circle;
            }
        }
        return largest;
    }
}