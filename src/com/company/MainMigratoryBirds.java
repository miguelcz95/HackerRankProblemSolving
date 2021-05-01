package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class MainMigratoryBirds {

    //INFO: https://www.hackerrank.com/challenges/migratory-birds/problem?h_r=next-challenge&h_v=zen

    public static void main(String[] args) {
        List<Integer> array = Arrays.stream("2 1 3 4 5 4 3 2 1 3 4".split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int n = 11;
        System.out.println(process(array, n));
    }

    static int process(List<Integer> arr, int n) {
        HashSet<Integer> set = new HashSet<>(arr);
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        set.forEach(value ->{
            treeMap.put(value,Collections.frequency(arr,value));
        });
        System.out.println(treeMap);
        return Collections.max(treeMap.entrySet(), Map.Entry.comparingByValue()).getKey();

/*        TreeMap<Integer, Integer> map = new TreeMap<>();
        arr.forEach(value -> {
            map.put(value, Collections.frequency(arr, value));
        });
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();*/

/*        List<Integer> listByKey = new ArrayList<>(map.values());
        listByKey.sort((o1, o2) -> o2 - o1);
        System.out.println(listByKey.toString());*/
    }
}
