package by.it_academy;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int length = n.length;
        int[] n1 = new int[length];
        int lastIndex = length - 1;
        System.out.println("Начальный массив:");
        System.out.println(Arrays.toString(n));
        System.out.println("После инвертирования:");
        for (int i = lastIndex; i >= 0; i--) {
            n1[lastIndex - i] = n[i];
        }
        System.out.println(Arrays.toString(n1));
    }
}