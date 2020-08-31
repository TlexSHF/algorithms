package org.pg4200.ex02;

import org.pg4200.les02.queue.MyQueue;

public class MyRingArrayQueue<T> implements MyQueue<T> {

    protected Object[] data;

    //When the head or tail is an invalid number (-1),
    // means there is no head or tail yet.
    private int head = -1;
    private int tail = -1;

    public MyRingArrayQueue(){
        this(10);
    }
    public MyRingArrayQueue(int capacity){
        data = new Object[capacity];
    }

    @Override
    public void enqueue(T value) {
        //adding one element

        if(isEmpty()){
            head = 0;
            tail = 0;
        } else if(tail < data.length - 1){
            //if not empty, and there is space, increase
            tail++;
        } else {
            //if not empty, but no more space
            if(head != 0) {
                //And if head is not at position 0
                tail = 0;

            } else {
                //If the array is completely full: Copy to larger array
                Object[] tmp = new Object[data.length * 2];

                int size = size();
                for(int i=0; i<size; i++){
                    tmp[i] = data[i + head];
                }
                head = 0;
                tail = size;
                data = tmp;
            }
        }

        data[tail] = value;
    }

    @Override
    public T dequeue() {
        if(isEmpty()){
            throw new RuntimeException();
        }

        T value = (T) data [head];

        if(size() == 1){
            //Now it is completely empty
            head = -1;
            tail = -1;
        } else {
            head++;
        }

        return value;
    }

    @Override
    public T peek() {
        if(isEmpty()){
            throw new RuntimeException();
        }
        return (T) data[head];
    }

    @Override
    public int size() {

        if(head < 0) {
            return 0;

        } else if(tail >= head) {
            return (tail - head) + 1;

        } else {
            return (data.length - head) + tail + 1;
        }
    }
}
