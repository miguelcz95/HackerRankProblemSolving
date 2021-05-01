package com.company;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class MainPerficient {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 4, 67, 9, 45, 7, 5, 3, 8};
        int sum = 0;
        for (Integer value : arr) {
            sum += value % 2 == 0 ? value : 0;
        }
        //System.out.println(sum);
        AtomicInteger sumAux = new AtomicInteger(0);
        Arrays.stream(arr).filter(integer -> integer % 2 == 0).forEach(integer -> sumAux.set(sumAux.get()+integer));
        System.out.println(sumAux.get());
        //System.out.println(recursiveSum(arr, 0));
    }

    static Integer recursiveSum(Integer[] array, int i) {
        if (i < array.length) {
            if (array[i] % 2 == 0) {
                return array[i] + recursiveSum(array, ++i);
            } else {
                return recursiveSum(array, ++i);
            }
        }
        return 0;
    }
}
