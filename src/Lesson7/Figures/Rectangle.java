package Lesson7.Figures;

public class Rectangle extends Figures {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double square() {
        double square = length * width;
        System.out.println("Площадь прямоугольника равна " + square);
        return square;
    }

    @Override
    public double perimeter() {
        double perimeter = length + length + width + width;
        System.out.println("Периметр прямоугольника равен " + perimeter);
        return perimeter;

    }
}
