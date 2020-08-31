package org.pg4200.ex02;

import org.junit.jupiter.api.Test;
import org.pg4200.les02.list.MyList;
import org.pg4200.les02.list.MyListTestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyBidirectionalLinkedListTest extends MyListTestTemplate {


    @Override
    protected <T> MyList<T> getNewInstance(Class<T> klass) {
        return new MyBidirectionalLinkedList<T>();
    }

    @Test
    public void testException(){
        MyList<String> data = getNewInstance(String.class);

    }
    @Test
    public void testInsertAboveMiddle(){
        MyList<String> data = getNewInstance(String.class);
        data.add("a");
        data.add("b");
        data.add("c");
        data.add("d");
        data.add("e");
        data.add("f");

        String value = "foo";
        data.add(4, value);

        assertEquals(7, data.size());
        assertEquals("a", data.get(0));

        assertEquals("b", data.get(1));
        assertEquals("c", data.get(2));
        assertEquals("d", data.get(3));
        assertEquals(value, data.get(4));
        assertEquals("e", data.get(5));
        assertEquals("f", data.get(6));


    }
}
