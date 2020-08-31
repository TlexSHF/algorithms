package org.pg4200.ex02;

import java.util.EmptyStackException;

public class StackLinkedList<T> {
    //Takes and inserts at head always (LIFO)
    //PUSH POP PEEK (add, remove, look)

    Node head = null;
    Node tail = null;
    int size = 0;

    private class Node{
        T value;
        Node next;
        //Node previous = null;

        public Node(T value) {
            this(value, null);
        }
        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void push(T value) {
        if(isEmpty()){
            head = new Node(value);
            tail = head;
        } else {
            Node newNode = new Node(value, head);
            //head.previous = newNode;
            head = newNode;
        }
        size++;
    }

    public void pop() {
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Empty Stack");
        } else {
            head = head.next;
            //head.previous = null;
            size--;
        }
    }

    public T peek() {
        if(isEmpty()){
            throw new IndexOutOfBoundsException("Empty Stack");
        } else {
            return head.value;
        }
    }

    private boolean isEmpty() {
        return size == 0;
    }

}
