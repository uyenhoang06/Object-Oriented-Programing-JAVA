package com.patterns.strategy.demoprograme;

public class InsertionSort implements ISort {
    @Override
    public int sort(int[] data) {
        if (data == null) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
                count++;
            }
            data[j + 1] = key;
        }
        return count;
    }
}
