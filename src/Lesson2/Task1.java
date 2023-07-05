import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int i = 0;
        System.out.println ("Введите номер месяца: ");
        Scanner mn = new Scanner(System.in);
        i = mn.nextInt();

        switch (i) {
            case 1:
                System.out.println ("Зима");
                break;
            case 2:
                System.out.println ("Зима");
                break;
            case 3:
                System.out.println ("Весна");
                break;
            case 4:
                System.out.println ("Весна");
                break;
            case 5:
                System.out.println ("Весна");
                break;
            case 6:
                System.out.println ("Лето");
                break;
            case 7:
                System.out.println ("Лето");
                break;
            case 8:
                System.out.println ("Лето");
                break;
            case 9:
                System.out.println ("Осень");
                break;
            case 10:
                System.out.println ("Осень");
                break;
            case 11:
                System.out.println ("Осень");
                break;
            case 12:
                System.out.println ("Зима");
                break;
            default:
                System.out.println ("Неверное число");
        }




    }
}
