package INSERTION_SORT;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] numbers = new int[]{ 31, 41, 59, 26, 41, 58 };
        System.out.println(Arrays.toString(numbers));
        for (int index = 1; index < numbers.length; index++) {
            int key = numbers[index];
            int secIndex = index - 1;
            while (secIndex > -1 && numbers[secIndex] > key) {
                numbers[secIndex + 1] = numbers[secIndex];
                secIndex--;
            }
            numbers[secIndex + 1] = key;
        }

        System.out.println(Arrays.toString(numbers));
    }
}