package Lesson8Exc;

import java.util.Scanner;

public class MainExc {
    public static boolean loginMethod(String login, String password, String confirmPassword) {
        try {

            if (login.length() >= 20 || login.contains(" ")) {
                throw new WrongLoginExc();
            }

            if (password.length() >= 20 || password.contains(" ") || !password.equals(confirmPassword)) {
                throw new WrongPasswordException();
            }

            return true;
        } catch (WrongLoginExc | WrongPasswordException exception) {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи логин пароль и подтверждение пароля: ");
        String a, b, c;
        boolean correctLogin = loginMethod(a = sc.nextLine(), b = sc.nextLine(), c = sc.nextLine());
        if (correctLogin) {
            System.out.println("Данные верны.");
        } else {
            System.out.println(" Введенные данные некорректны");
        }

    }
}
