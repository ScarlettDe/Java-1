import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    }
    //sout

    static int task3(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }


    static boolean task4(int a, int b) {
        int summ = a + b;
        if (summ > 10 && summ < 20) {
            return true;
        } else {
            return false;
        }
    }


    static void task5(int a) {
        if (a >= 0) {
            System.out.println("Число" + a + "положительное");
        } else {
            System.out.println("Число" + a + "отрицательное");
        }
    }

    static boolean task6(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    static void task7(String name) {
        System.out.println("Привет," + name + "!");
    }

    static void taks8(String[] args) {
        System.out.println("Введите год");
        Scanner years = new Scanner(System.in);
        double year = years.nextInt();
        if (year % 4 == 0 || year % 400 == 0 || year / 400 == 1) {
            System.out.println("Год является високосным");
        } else if (year % 100 == 0) {
            System.out.println("Год не является високосным");
        }


    }
}
