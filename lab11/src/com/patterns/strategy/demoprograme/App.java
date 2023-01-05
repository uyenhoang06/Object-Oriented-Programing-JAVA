package com.patterns.strategy.demoprograme;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        SortStrategy sortStrategy = SortStrategy.getInstance();

        int length = (int) (Math.random() * 10) + 1;
        int[] array = new int[length];
        int[] array1 = new int[length];
        int[] array2 = new int[length];
        int[] array3 = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = (int) (Math.random() * 20) + 1;
        }

        System.arraycopy(array, 0, array1, 0, length);
        System.arraycopy(array, 0, array2, 0, length);
        System.arraycopy(array, 0, array3, 0, length);

        System.out.println("Using Bubble Sort Algorithm:");
        System.out.println("Before sorting: " + Arrays.toString(array1));
        sortStrategy.setSortee(new BubbleSort());
        int swap1 = sortStrategy.sort(array1);
        System.out.println("After sorting: " + Arrays.toString(array1));
        System.out.println("Number of swap: " + swap1);
        System.out.println();

        System.out.println("Using Insertion Sort Algorithm:");
        System.out.println("Before sorting: " + Arrays.toString(array2));
        sortStrategy.setSortee(new InsertionSort());
        int swap2 = sortStrategy.sort(array2);
        System.out.println("After sorting: " + Arrays.toString(array2));
        System.out.println("Number of swap: " + swap2);
        System.out.println();

        System.out.println("Using Selection Sort Algorithm: ");
        System.out.println("Before sorting :" + Arrays.toString(array3));
        sortStrategy.setSortee(new SelectionSort());
        int swap3 = sortStrategy.sort(array3);
        System.out.println("After sorting: " + Arrays.toString(array3));
        System.out.println("Number of swap: " + swap3);
        System.out.println();
    }
}
