package by.it_academy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] n = {10, 45, -78, 254, 545874, 12545, 545, 454, 888, 44};
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < 10; i++) {
            if (n[i] > n[maxIndex]) {
                maxIndex = i;
            } else if (n[i] < n[minIndex]) {
                minIndex = i;
            }
        }
        int minvalue = n[minIndex];
        int maxvalue = n[maxIndex];
        System.out.println("min value = " + minvalue + "\n" + "max value = " + maxvalue);
        n[maxIndex] = 99;
        n[minIndex] = 0;
        System.out.println(Arrays.toString(n));
    }
}