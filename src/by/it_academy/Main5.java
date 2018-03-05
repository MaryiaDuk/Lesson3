package by.it_academy;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        int[] n = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        int length = n.length;
        System.out.println("Исходный массив:" + "\n" + Arrays.toString(n));
        for (int i = 0; i < length; i++) {
            int min = n[i];
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (n[j] < min) {
                    min = n[j];
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int tmp = n[i];
                n[i] = n[minIndex];
                n[minIndex] = tmp;
            }
        }
        System.out.println("Отсортированный массив:" + "\n" + Arrays.toString(n));
    }
}