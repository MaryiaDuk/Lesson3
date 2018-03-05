package by.it_academy;

public class Main2 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 6, 3, 0, 9, 1, 6, 3, 7, 5};
        int arrayLength = array.length;
        int[] counter = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            counter[array[i]]++;
        }
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] >= 2) System.out.println(i + " - повторений " + counter[i]);
        }
    }
}