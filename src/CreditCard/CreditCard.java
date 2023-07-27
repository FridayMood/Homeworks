package CreditCard;

import java.util.Random;
import java.util.Scanner;

public class CreditCard {
    String accountNumber;
    double currentAmount;

    public CreditCard() {
        Random random = new Random();
        String [] account = new String[]{"10023456", "10067895", "1008899"};
        int n = (int)Math.floor(Math.random() * account.length);
        this.accountNumber = account[n];
        this.currentAmount = random.nextDouble(0,10000);
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "accountNumber=" + accountNumber +
                ", currentAmount=" + currentAmount +
                '}';
    }
    double plus(double amount)
    {
        currentAmount = currentAmount  + amount;
        return currentAmount;
    }
    double minus(double amount)
    {
        currentAmount = currentAmount  - amount;
        return currentAmount;
    }
    void showinfo()
    {   System.out.println("Текущая информация о карточке: " );
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Amount: " + currentAmount);
        System.out.println();

    }

}
