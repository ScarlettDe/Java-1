public class Lesson2 {
    public static void main(String[] args) {
        //Task1
        int[] first = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < first.length; i++) {
            first[i] = first[i] == 1 ? 0 : 1;
            System.out.print(first[i] + " ");
        }

        //Task2
        int[] second = new int[8];
        for (int i = 1, i1 = 0; i < second.length; i++) {
            second[i] = i1 += 3;
        }
        for (int a : second) {
            System.out.print(a + " ");
        }

        //Task3
        int[] third = {1, 2, 3, 4, 11, 6, 5, 9, 12, 1, 9,};
        for (int i2 = 0; i2 < third.length; i2++) {
            if (third[i2] < 6) third[i2] *= 2;
            System.out.print(third[i2] + " ");
        }

        //Task4
        int[][] fourth = new int[7][7];
        for (int i = 0; i < fourth.length; i++) {
            for (int i2 = 0, j2 = fourth[i].length; i2 < fourth[i].length; i2++, j2--) {
                if (i == i2 || i == (j2 - 1)) fourth[i][i2] = 1;
                System.out.print(fourth[i][i2] + " ");
            }
        }

        //Task5
        int[] Fifth = {10, 3, 6, 5, 1, 3, 5, 7, 8, 3, 9, 11};
        int min = Fifth[0], max = Fifth[0];
        for (int i = 0; i < Fifth.length; i++) {
            if (Fifth[i] > max) {
                max = Fifth[i];
            }
            if (Fifth[i] < min) {
                min = Fifth[i];
            }
        }
        System.out.println("Максимальное значение = " + max);
        System.out.println("Минимальное значение = " + min);
    }
}
