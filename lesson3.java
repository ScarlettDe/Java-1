import java.util.Scanner;

import static java.lang.Math.random;

public class lesson3 {
    public static void main(String[] args) {
        //Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это
        // число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное,
        // или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 –
        // повторить, 0 – нет).
        System.out.println("Добрый ???,выберете уровень сложности");
        System.out.println("1.Легкий");
        System.out.println("  Нужно угадать число от 0 до 400. Попытки без ограничений");
        System.out.println("2.Средний");
        System.out.println("  Нужно угадать число от 0 до 600. Всего 50 попыток");
        System.out.println("3.Сложный");
        System.out.println("  Нужно угадать число от 0 до 1000. Всего 10 попыток");
        Scanner levels = new Scanner(System.in);
        int level = levels.nextInt();
        if (level != 1 && level != 2 && level != 3) {
            System.out.println("Level not found");
        } else if (level == 1) {
            System.out.println("Число загадано,игра началась");
            int a = (int) (Math.random() * 400);
            for (int i = 0; ; i++) {
                Scanner a1 = new Scanner(System.in);
                int easy = a1.nextInt();
                if (easy > a) {
                    System.out.println("Загаданное число меньше,поппробуйте еще раз");
                } else if (easy < a) {
                    System.out.println("Загаданное число больше,попробуйте еще раз");
                } else {
                    System.out.println("Вы угадали");
                    break;
                }
            }
            System.out.println();
            System.out.println("Игра окончена,у вас закончились попытки");

        } else if (level == 2) {
            System.out.println("Число загадано,игра началась");
            int a = (int) (Math.random() * 600);
            for (int i = 0; i < 49; i++) {
                Scanner a1 = new Scanner(System.in);
                int easy = a1.nextInt();
                int n = 50 - i;
                if (easy > a) {
                    System.out.println("Загаданное число меньше,попробуйте еще раз,у вас осталось " + n + " попыток");
                } else if (easy < a) {
                    System.out.println("Загаданное число больше,попробуйте еще раз,у вас осталось " + n + " попыток");
                } else if (easy == a) {
                    System.out.println("Вы угадали");
                    break;
                }
            }
            System.out.println();
            System.out.println("Игра окончена,у вас закончились попытки");
        } else if (level == 3) {
            System.out.println("Число загадано,игра началась");
            int a = (int) (Math.random() * 1000);
            for (int i = 0; i < 10; i++) {
                Scanner a1 = new Scanner(System.in);
                int easy = a1.nextInt();
                int n = 9 - i;
                if (easy > a) {
                    System.out.println("Загаданное число меньше,попробуйте еще раз,у вас осталось " + n + " попыток");
                } else if (easy < a) {
                    System.out.println("Загаданное число больше,попробуйте еще раз,у вас осталось " + n + " попыток");
                } else if (easy == a) {
                    System.out.println("Вы угадали");
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("Игра окончена,у вас закончились попытки");
    }
}