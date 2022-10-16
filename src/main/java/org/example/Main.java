package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //   First level: 1. создать лист, наполнить его 10М> елементами
        List<Integer> list = new ArrayList<>(Arrays.asList(33, 5, 12, 8, 45, 70, 112, 4, 10, 56));

        iterateListOne(list);
        iterateListTwo(list);
        iterateListThree(list);
        iterateListFour(list);
        iterateListFive(list);
        iterateListSix(list);
    }

    // внутри тела кладем i- тый элемент в переменную temp
    private static void iterateListOne(List<Integer> list) {
        long start = System.nanoTime();
        int temp = 0;
        for (Integer a : list) {
            temp = a;
            System.out.print(temp + " ");
        }
        System.out.println();
        System.out.println("Operating time of the method One " + (System.nanoTime() - start) + " nanoseconds");

    }

    // classic for и вызываем list.size() для каждой итерации
    private static void iterateListTwo(List<Integer> list) {
        long start = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.size() + " ");
        }
        System.out.println();
        System.out.println("Operating time of the method  Two " + (System.nanoTime() - start) + " nanoseconds");
    }

    // classic for, но list.size() определяем в переменную
    private static void iterateListThree(List<Integer> list) {
        long start = System.nanoTime();
        int size = list.size();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(size + " ");
        }
        System.out.println();
        System.out.println("Operating time of the method Three " + (System.nanoTime() - start) + " nanoseconds");
    }

    // classic for, list.size() определяем в переменную, перебираем с конца (i--)
    private static void iterateListFour(List<Integer> list) {
        long start = System.nanoTime();
        int size = list.size();
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(size + " ");
        }
        System.out.println();
        System.out.println("Operating time of the method Four " + (System.nanoTime() - start) + " nanoseconds");
    }

    //  используя Itertor
    private static void iterateListFive(List<Integer> list) {
        long start = System.nanoTime();
        Iterator<Integer> iterator = list.iterator();
        int size = list.size();
        while (iterator.hasNext()) {
            iterator.next();
            System.out.print(size + " ");
        }
        System.out.println();
        System.out.println("Operating time of the method Five " + (System.nanoTime() - start) + " nanoseconds");
    }

    // используя ListIterator
    private static void iterateListSix(List<Integer> list) {
        long start = System.nanoTime();
        ListIterator<Integer> iterator = list.listIterator();
        int size = list.size();
        while (iterator.hasNext()) {
            iterator.next();
            System.out.print(size + " ");
        }
        System.out.println();
        System.out.println("Operating time of the method Six " + (System.nanoTime() - start) + " nanoseconds");
    }
}