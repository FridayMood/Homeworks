package Lesson7.Figures;

public class Triangle extends Figures {
    private double sideA;
    private double sideB;
    private double sideC;
    private double high;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC, double high) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.high = high;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public double square() {
        double square = 0.5 * sideA * high;
        System.out.println("Площадь треугольника равна " + square);
        return square;
    }

    @Override
    public double perimeter() {
        double perimeter = sideA + sideB + sideC;
        System.out.println("Периметр треугольника равен " + perimeter);
        return perimeter;
    }
}
