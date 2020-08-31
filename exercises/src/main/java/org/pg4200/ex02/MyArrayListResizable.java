package org.pg4200.ex02;

import org.pg4200.les02.list.MyArrayList;

public class MyArrayListResizable<T> extends MyArrayList<T> {

    //data = the real array

    public MyArrayListResizable(){
        this(10);
    }
    public MyArrayListResizable(int capacity){
        data = new Object[capacity];
    }


    @Override
    public void add(int index, T value){

        //Validating input
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }

        //Validating enough space
        //Size and length would be the same, even though size is the last element,
        //and length is one more than the last element
        if(size == data.length){
            //Move to new array
            Object[] temporary = new Object[data.length * 2];

            int size = size();

            for(int i=0; i<size; i++){
                temporary[i] = data[i];
            }

            data = temporary;
        }

        //Iterates backwards from last last place,
        // and shifts all elements to the right,
        // until reached the index.
        for(int j = size-1; j >= index; j--){
            data[j+1] = data[j];
        }

        data[index] = value;
        size++;
    }
}
