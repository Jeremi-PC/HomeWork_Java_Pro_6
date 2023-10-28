package org.example.arrayIterator;
//Создайте итератор по массиву целых чисел,
// который будет выводить элементы в порядке их убывания.
// Исходный массив не должен при этом измениться.

import java.util.*;

import static java.util.Spliterators.iterator;

public class Main {
    public static void main(String[] args) {

        int[] originalArr = {5, 4, 8, 5, 2, 26, 64, 645};
        String arrElements = Arrays.toString(originalArr);
        System.out.println(arrElements);

//        ReverseIterator reverseIterator = new ReverseIterator();
//        reverseIterator.iterator(originalArr);
//        System.out.println();
//        System.out.println(arrElements); // исходный массив

        ReverseIterator iterator = new ReverseIterator(originalArr);

        while (iterator.hasNext()) {
            int element = iterator.next();
            System.out.print(element + " ");
        }


    }
}
