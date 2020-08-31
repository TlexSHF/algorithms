package org.pg4200.ex02;

import java.util.EmptyStackException;

public class QueueLinkedList<T> {
    //In tail, Out head (FIFO)
    //enqueue, dequeue, read from head

    Node head = null;
    Node tail = null;
    int size = 0;

    private class Node{
        T value;
        Node previous;
        Node next = null;

        public Node(T value) {
            this(value, null);
        }
        public Node(T value, Node previous) {
            this.value = value;
            this.previous = previous;
        }
    }

    public void enqueue(T value) {
        if(isEmpty()) {
            tail = new Node(value);
            head = tail;
        } else {
            Node newNode = new Node(value, tail);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    public void dequeue() {
        if(isEmpty()) {
            throw new IndexOutOfBoundsException("Empty queue");
        } else {
            head = head.next;
            head.previous = null;
            size--;
        }
    }
    public T peek() {
        if(isEmpty()) {
            throw new IndexOutOfBoundsException("Empty queue");
        } else {
            return head.value;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
