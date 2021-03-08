package com.company;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Ejercicio1();
    }

    static void Ejercicio1() {
        List<Integer> grades = Stream.of(22, 86, 30, 0, 16, 51, 53, 42, 48, 22, 69, 12, 27, 34, 24, 95, 16, 32, 22, 52, 56, 71, 95).collect(Collectors.toList());
        //List<Integer> grades = Stream.of(73,67,38,33).collect(Collectors.toList());
        AtomicInteger i = new AtomicInteger(0);
        AtomicInteger aux = new AtomicInteger(0);

        List<Integer> gradesFinal = grades.stream().map(grade -> {
            return ((grade < 38) || (grade % 5 < 3)) ? grade : (grade + (5 - (grade % 5)));
        }).collect(Collectors.toList());

/*        List<Integer> gradesFinal = grades.stream().map(grade -> {
            aux.set(0);
            i.set(0);
            if (grade < 40) return grade;
            while (aux.get() == 0) {
                if (((grade + i.get()) % 5) <3 ) {
                    if (((grade + i.get()) - grade) < 3) {
                        return ((grade + i.get()));
                    }
                    aux.set(1);
                    i.set(0);
                    return grade;
                } else {
                    i.getAndIncrement();
                }
            }
            return grade;
        }).collect(Collectors.toList());*/
       gradesFinal.forEach(System.out::println);
    }
}
