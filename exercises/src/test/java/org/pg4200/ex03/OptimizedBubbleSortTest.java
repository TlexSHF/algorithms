package org.pg4200.ex03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OptimizedBubbleSortTest {

    OptimizedBubbleSort bubbleSort;

    @BeforeEach
    public void beforeEach() {
        bubbleSort = new OptimizedBubbleSort();
    }

    @Test
    public void test() {
        int a = 2;
        int b = 3;
        int c = 8;
        int d = 9;
        int e = 3;
        int f = 4


        int[] arr = {a, b, c, d, e, f};
        bubbleSort.sort(arr, Comparator<Integer>, true)
    }

}
