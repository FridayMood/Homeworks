import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println ("Введите номер цвета в радуге (от 1 до 7): ");
        Scanner mn = new Scanner(System.in);
        i = mn.nextInt();

        switch (i){
            case 1:
                System.out.println ("Красный");
                break;
            case 2:
                System.out.println ("Оранжевый");
                break;
            case 3:
                System.out.println ("Желтый");
                break;
            case 4:
                System.out.println ("Зеленый");
                break;
            case 5:
                System.out.println ("Голубой");
                break;
            case 6:
                System.out.println ("Синий");
                break;
            case 7:
                System.out.println ("Фиолетовый");
                break;
            default:
                System.out.println ("Неверный номер");
        }
    }
}
