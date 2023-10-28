package org.example.iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

//Создайте коллекцию (List или Set), добавьте несколько элементов.
// Организовать цикл while по коллекции с помощью итератора.
// Организовать цикл for (не путать с foreach!)
// по коллекции с помощью итератора.
public class Main {
    public static void main(String[] args) {
        int listSize = 10;
        Random rnd = new Random();

        Set<Integer> elements = new HashSet<>();
        int i = 0;
        while (i < listSize || elements.size() < listSize) {
            elements.add(rnd.nextInt(26));
            i++;
        }

        Iterator<Integer> iterator = elements.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        Iterator<Integer> it = elements.iterator();
        for (; it.hasNext(); ) {
            System.out.print(it.next() + " ");
          }
    }
}


