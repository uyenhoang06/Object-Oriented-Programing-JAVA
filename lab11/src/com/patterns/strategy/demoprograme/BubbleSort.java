package com.patterns.strategy.demoprograme;

public class BubbleSort implements ISort {
    @Override
    public int sort(int[] data) {
        if (data == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < data.length; ++i) {
            for (int j = i + 1; j < data.length; ++j) {
                if (data[i] > data[j]) {
                    int tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                    count++;

                }
            }
        }
        return count;
    }
}
