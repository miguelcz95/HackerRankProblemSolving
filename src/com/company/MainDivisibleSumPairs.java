package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainDivisibleSumPairs {
    public static void main(String[] args) {
        List<Integer> ar = Arrays.stream("50 44 77 66 70 58 9 59 74 82 87 15 10 95 10 81 2 4 87 85 28 96 76 18 86 91 94 59 19 58 98 48 38 70 36 38 66 9 72 54 23 23 17 18 8 16 9 56 12 59 73 31 10 62 83 84 28 91 29 22 73 22 3 75 26 31 93 57 15 32 46 74 99 10 15 58 60 53 41 49 71 59 4 20 38 78 1 94 76 5 70 68 42 34 77 28 19 25 20 15".split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int n = 6;
        int k = 66;
        System.out.println(proceso(ar, k));
    }

    static int proceso(List<Integer> ar, int k) {
        AtomicInteger cont = new AtomicInteger(0);
        IntStream.range(0, ar.size()).forEach(index -> {
            IntStream.range(0, ar.size()).forEach(index2 -> {
                cont.set((index < index2 && (ar.get(index) + ar.get(index2)) % k == 0) ? cont.get() + 1 : cont.get());
            });
        });
        return cont.get();
    }

}
