package Lesson7.Figures;

public class Circle extends Figures {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        double square = 3.14 * (radius * radius);
        System.out.println("Площадь круга равна " + square);
        return square;
    }

    @Override
    public double perimeter() {
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Периметр круга равен " + perimeter);
        return perimeter;
    }
}
