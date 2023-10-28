package org.example.arrayIterator;

//public class ReverseIterator {
//      public ReverseIterator() {
//
//    }
//
//    public void iterator(int[] origArr) {
//        int arrLength = origArr.length;
//        for (int i = arrLength - 1; i > -1; i--) {
//            System.out.print(origArr[i] + " ");
//        }
//    }
//}

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReverseIterator implements Iterator<Integer> {
    private int[] arr;
    private int currentIndex;

    public ReverseIterator(int[] arr) {
        this.arr = arr;
        this.currentIndex = arr.length - 1;
    }

    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return arr[currentIndex--];
    }
}