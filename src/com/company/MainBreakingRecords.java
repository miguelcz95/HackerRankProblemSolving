package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class MainBreakingRecords {

    //INFO: https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

    public static void main(String[] args) {
        int n = 9;
        List<Integer> arr = Arrays.stream("10 5 20 20 4 5 2 25 1".split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(process(arr));
    }

    static List<Integer> process(List<Integer> scores) {
        AtomicInteger highestScore = new AtomicInteger(scores.get(0));
        AtomicInteger lowestScore = new AtomicInteger(scores.get(0));
        AtomicInteger highestCont = new AtomicInteger(0);
        AtomicInteger lowestCont = new AtomicInteger(0);
        scores.forEach(value -> {
            if (value > highestScore.get()) {
                highestScore.set(value);
                highestCont.incrementAndGet();
            }
            if (value < lowestScore.get()) {
                lowestScore.set(value);
                lowestCont.incrementAndGet();
            }
        });
        return Arrays.asList(highestCont.get() == -1 ? 0 : highestCont.get(), lowestCont.get() == -1 ? 0 : lowestCont.get());
    }
}
