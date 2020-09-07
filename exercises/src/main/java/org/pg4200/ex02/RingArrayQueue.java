package org.pg4200.ex02;

public class RingArrayQueue<T> {

    protected Object[] data;
    private int size = 0;
    private int head = -1;
    private int tail = -1;

    public RingArrayQueue(){
        data = new Object[10];
    }

    public void enqueue(T value) {
        if(size == data.length) {
            resize();

        } else {

            if (size == 0) {
                head = 0;
                tail = 0;

                data[0] = value;

            } else if (tail + 1 == data.length) {

                tail = 0;
                data[0] = value;

            } else {
                data[tail + 1] = value;
                tail++;
            }
        }
        size++;
    }

    public void dequeue() {
        data[head] = null;
        head++;

    }

    public T peek() {
        return null;
    }

    public void resize() {

    }
}
