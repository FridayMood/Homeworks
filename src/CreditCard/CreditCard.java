package CreditCard;

import java.util.Random;
import java.util.Scanner;

public class CreditCard {
    long accountNumber;
    double currentAmount;

    public CreditCard() {
        Random random = new Random();
        this.accountNumber = random.nextLong(100234567, 295678456);
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
