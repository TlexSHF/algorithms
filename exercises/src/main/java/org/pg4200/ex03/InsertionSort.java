package org.pg4200.ex03;

import java.util.Comparator;

public class InsertionSort {

    public <T> T[] sort(T[] array, Comparator<T> comp) {

        int target = 1;
        boolean isSorting = true;

        if(array.length <= 1) {
            return array;
        }


        while(isSorting) {

            for(int i = target; i > 0; i--) {
                int j = i - 1;

                if(comp.compare(array[i], array[j]) < 0) {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                } else {
                    break;
                }
            }

            target++;
            if(target == array.length) isSorting = false;
        }

        return array;
    }
}
