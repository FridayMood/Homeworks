import java.util.Scanner;

public class Add2Case2 {
    public static void main(String[] args) {
        float sum;
        int n;
        float perc;
        float common=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        sum = sc.nextFloat();
        System.out.println("Введите количество месяцев: ");
        n = sc.nextInt();

        for (int i=1; i<=n;i++)
        {
            perc= (sum/100*7) * n;
            common = sum+perc;
        }

        System.out.println("Сумма с процентами: " + common);
    }
}
