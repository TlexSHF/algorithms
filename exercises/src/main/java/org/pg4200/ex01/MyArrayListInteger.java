package org.pg4200.ex01;

public class MyArrayListInteger {

    private Integer[] data;
    private int size = 0;

    //Constructor that calls constructor#2 with default 10 max size
    public MyArrayListInteger(){
        this(10);
    }
    public MyArrayListInteger(int maxSize){
        data = new Integer[maxSize];
    }

    //Array's .get method
    public Integer get(int index) {
        if(index < 0 || index >= size){
            throw new IllegalArgumentException();
        }
        return data[index];
    }

    //Array's .add method
    public void add(Integer value) {
        data[size] = value;
        size++;
    }

    //Array's .size method
    public int size(){
        return size;
    }
}
