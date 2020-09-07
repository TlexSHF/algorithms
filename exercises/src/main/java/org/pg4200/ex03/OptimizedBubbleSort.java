package org.pg4200.ex03;

import java.util.Comparator;

public class OptimizedBubbleSort<T>{

    public <T> int sort(T[] array, Comparator<T> comparator, boolean optimized) {
        //Sort the input array based on a given Comparator.
        //The method should return the number of times the method Comparator#compare is called.

        boolean swapped;
        int n = array.length;
        int target = n-1;
        int lastSwap = n-1;
        //int swaps = 0;
        int comparisons = 0;


            if(n < 1){
                return 0;
            }

            swapped = true;
            while(swapped) {

                if(optimized) {
                    target = lastSwap;
                }


                swapped = false;
                for(int i = 0; i < target; i++) {

                    comparisons++;
                    if(comparator.compare(array[i], array[i+1]) > 0){
                        T temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;

                        lastSwap = i;
                        swapped = true;
                        //swaps++;
                    }
                }
            }

        return comparisons;
    }
}
