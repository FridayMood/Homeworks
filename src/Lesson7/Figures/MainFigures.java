package Lesson7.Figures;

public class MainFigures {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 6);
        Circle c1 = new Circle(15.5);
        Triangle t1 = new Triangle(5, 7, 8, 5.5);
        r1.perimeter();
        r1.square();
        c1.perimeter();
        c1.square();
        t1.perimeter();
        t1.square();

        System.out.println();
        System.out.println("Часть про массив");

        double perimeterSum = 0;

        Figures[] figures = {new Rectangle(5, 7), new Triangle(10, 5, 6, 4), new Circle(5), new Rectangle(7, 7), new Circle(88)};
        for (int i = 0; i < figures.length; i++) {

            double n = figures[i].perimeter();
            perimeterSum = perimeterSum + n;
        }
        System.out.println("Сумма всех периметров равна " + perimeterSum);
    }
}
