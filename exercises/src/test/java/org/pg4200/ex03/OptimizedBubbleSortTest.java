package org.pg4200.ex03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Comparator;

public class OptimizedBubbleSortTest {

    OptimizedBubbleSort bubbleSort;
    Comparator comparator;


    @BeforeEach
    public void beforeEach() {
        bubbleSort = new OptimizedBubbleSort();
    }

    @Test
    public void testInsertionSortInt() {
        InsertionSort insertionSort = new InsertionSort();

        comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //If first is < || == || > than second
                //Return negative, zero or positive number
                return o1.compareTo(o2);
            }
        };

        Integer[] arr = {4, 5, 1, 3, 2, 6};
        Integer[] solution = {1, 2, 3, 4, 5, 6};

        insertionSort.sort(arr, comparator);

        for (int i = 0; i < arr.length; i++) {
            assertEquals(solution[i], arr[i]);
            System.out.println(arr[i]);
        }

    }

    @Test
    public void testInt() {
        comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //If first is < || == || > than second
                //Return negative, zero or positive number
                return o1.compareTo(o2);
            }
        };

        int a = 3;
        int b = 7;
        int c = 1;
        int d = 24;
        int e = 8;
        int f = 4;
        int g = 2;
        int h = 1;
        int z = 22;


        Integer[] arr = {a, b, c, d, e, f, g, h, z};
        Integer[] solution = {1, 1, 2, 3, 4, 7, 8, 22, 24};

        int comparisons = bubbleSort.sort(arr, comparator, true);

        for (int i = 0; i < arr.length; i++) {
            assertEquals(solution[i], arr[i]);
            System.out.println(arr[i]);
        }

        assertEquals(29, comparisons);
    }

    /*@Test
    public void testString() {
        comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };


        String a = "hei";
        String b = "hOI";
        String c = "henlo";
        String d = "temmie";
        String e = "doggo";
        String f = "woof";


        String[]
    }*/

    /*@Test
    public void testGameUser() {

        comparator = new GameUserComparator();

        GameUser p1 = new GameUser("MousePad", 30);
        GameUser p2 = new GameUser("Stanley", 75);
        GameUser p3 = new GameUser("Audio", 80);
        GameUser p4 = new GameUser("Technica", 130);
        GameUser p5 = new GameUser("Steelseries", 80);

        GameUser[] arr = {p1, p2, p3, p4, p5};
        GameUser[] solution = {p4, p3, p5, p2, p1};

        int comparisons = bubbleSort.sort(arr, comparator, true);

    }*/

}
