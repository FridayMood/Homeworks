package CreditCard;

import Lesson5.Students910;

public class CreditCardMain {
    public static void main(String[] args) {
        CreditCard [] creditCard = new CreditCard[3];
        System.out.println("Список всех карточек: ");
        for (int i = 0; i < creditCard.length; i++) {
            creditCard[i] = new CreditCard();
            creditCard[i].showinfo();
        }
        creditCard[0].plus(100.01);
        creditCard[1].plus(200);
        creditCard[2].minus(300.00);

        System.out.println("Карточки после изменений: ");
        for (int i = 0; i < creditCard.length; i++) {
            creditCard[i].showinfo();
        }

    }
}
