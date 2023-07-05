package Lesson2;

public class NumberInWord {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            String numberWord = " ";
            switch (i) {
                case 1:
                    numberWord = "Один";
                    break;
                case 2:
                    numberWord = "Два";
                    break;
                case 3:
                    numberWord = "Три";
                    break;
                case 4:
                    numberWord = "Четыре";
                    break;
                case 5:
                    numberWord = "Пять";
                    break;
                case 6:
                    numberWord = "Шесть";
                    break;
                case 7:
                    numberWord = "Семь";
                    break;
                case 8:
                    numberWord = "Восемь";
                    break;
                case 9:
                    numberWord = "Девять";
                    break;
                case 10:
                    numberWord = "Десять";
                    break;
            }


            System.out.println(numberWord);

        }

    }
}
