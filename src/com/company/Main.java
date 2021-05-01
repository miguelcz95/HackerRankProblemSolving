package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner leer = new Scanner(System.in);
            String nombres = leer.nextLine();
            int edad = leer.nextInt();
            leer.nextLine();
            String apellidos = leer.nextLine();

            System.out.println(nombres);
            System.out.println(edad);
            System.out.println(apellidos);
        } catch (Exception e) {
            System.out.println("Holiwis");
        }

        //Ejercicio1();
        //Ejercicio2();
        //Ejercicio3();
        //Ejercicio4();
        //Ejercicio2();
        //Ejercicio1();
    }

    private static void Ejercicio4() {
        int[] a = {1, 2, 3};
        int[] b = {3, 2, 1};

        List<Integer> result = new ArrayList<>();
        int contA = 0, contB = 0;

        for (int i = 0; i < a.length; i++) {
            contA = a[i] < b[i] ? contA + 1 : contA;
        }
        for (int i = 0; i < a.length; i++) {
            contB = a[i] > b[i] ? contB + 1 : contB;
        }

        result.add(contB);
        result.add(contA);
        System.out.println(result.toString());
    }

    private static void Ejercicio2() {
        int n = 6;
        int[] ar = {1, 2, 3, 4, 10, 11};
        System.out.println(Arrays.stream(ar).sum());

    }

    private static void Ejercicio1() {
        int a = 2, b = 5;
        System.out.println(a + b);
    }

    private static void Ejercicio3() {

    }

/*    private static void Ejercicio2() {
        int n = 50;
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }*/

/*    static void Ejercicio1() {
        //List<Integer> grades = Stream.of(22, 86, 30, 0, 16, 51, 53, 42, 48, 22, 69, 12, 27, 34, 24, 95, 16, 32, 22, 52, 56, 71, 95).collect(Collectors.toList());
        List<Integer> grades = Stream.of(73,67,38,33).collect(Collectors.toList());
        AtomicInteger i = new AtomicInteger(0);
        AtomicInteger aux = new AtomicInteger(0);

        List<Integer> gradesFinal = grades.stream().map(grade -> {
            return ((grade < 38) || (grade % 5 < 3)) ? grade : (grade + (5 - (grade % 5)));
        }).collect(Collectors.toList());

       List<Integer> gradesFinal = grades.stream().map(grade -> {
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
        }).collect(Collectors.toList());*//*
       gradesFinal.forEach(grade -> Logger.getLogger(grade.toString()));
    }*/
}
