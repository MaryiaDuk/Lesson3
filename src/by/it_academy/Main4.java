package by.it_academy;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {
        String str = "1578";
        int length = str.length();
        int n = Integer.parseInt(str);
        boolean test = true;
        int[] num = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            num[i] = n % 10;
            n = n / 10;
        }
        System.out.println(Arrays.toString(num));
        for (int i = 0; i < length - 1; i++) {
            if (num[i] >= num[i + 1]) test = false;
        }
        if (test) System.out.println("Цифры числа образуют возрастающую посл.");
        else System.out.println("Цифры числа не образуют возрастающую посл.");
    }
}