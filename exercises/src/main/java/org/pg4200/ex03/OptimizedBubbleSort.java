package org.pg4200.ex03;

import java.util.Comparator;

public class OptimizedBubbleSort{

    public <T> int sort(T[] array, Comparator<T> comparator, boolean optimized) {
        //Sort the input array based on a given Comparator.
        //The method should return the number of times the method Comparator#compare is called.

        boolean swapped;
        int n = array.length;
        int lastSwapPos = n-1;
        int tempSwap = n-1;
        int swaps = 0;

        if(optimized) {

            if(n < 1){
                return 0;
            }

            swapped = true;
            while(swapped) {

                swapped = false;
                for(int i = 0; i < lastSwapPos; i++) {

                    if(comparator.compare(array[i], array[i+1]) > 0){
                        T temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;

                        tempSwap = i;
                        swapped = true;
                        swaps++;
                    }


                }

                lastSwapPos = tempSwap;
            }

        }

        return swaps;
    }
}
