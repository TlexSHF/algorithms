package org.pg4200.ex01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListIntegerTest {


    private MyArrayListInteger getNewInstance() {
        return new MyArrayListInteger(10);
    }
    private MyArrayListInteger list;

    @BeforeEach
    public void initTest(){
        //before each test, create new instance
        list = getNewInstance();
    }


    @Test
    public void testEmpty(){
        //newly created containers should be empty
        assertEquals(0, list.size());
    }


    @Test
    public void testAddOneElement(){
        //Getting size, adding element, checking if size is 1 larger now

        int n = list.size();

        list.add(5);

        assertEquals(n + 1, list.size());
    }


    @Test
    public void testAddAndRetrieveElement(){
        //Adding element to position 0, checking if .get(0) retrieves that element

        Integer value = 5;

        list.add(value);

        Integer res = list.get(0);

        assertEquals(value, res);

    }

    @Test
    public void testAdd5Elements(){
        //Checking if default size is 0, adding 5 elements, checking if retrieved correct elements

        assertEquals(0, list.size());
        Integer a = 0;
        Integer b = 1;
        Integer c = 2;

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(a);
        list.add(a);

        assertEquals(a, list.get(0));
        assertEquals(b, list.get(1));
        assertEquals(c, list.get(2));
        assertEquals(a, list.get(3));
        assertEquals(a, list.get(4));
    }

    @Test
    public void testOutOfIndex(){
        //Changed from assertNull to assertThrows(IllegalArgumentException)

        assertThrows(IllegalArgumentException.class,
                () -> list.get(-5));
        assertThrows(IllegalArgumentException.class,
                () -> list.get(42));
    }
}
