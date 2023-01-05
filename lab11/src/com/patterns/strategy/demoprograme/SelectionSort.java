package com.patterns.strategy.demoprograme;

public class SelectionSort implements ISort {

    @Override
    public int sort(int[] data) {
        if (data == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < data.length - 1; i++) {
            int min = data[i];
            int temp = 0;
            for (int j = i + 1; j < data.length; j++) {
                if (min > data[j]) {
                    min = data[j];
                    temp = j;
                }
            }
            if (temp != 0) {
                data[temp] = data[i];
                data[i] = min;
                count++;
            }
        }
        return count;
    }
}
