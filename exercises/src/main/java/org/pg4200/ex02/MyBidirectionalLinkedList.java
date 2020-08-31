package org.pg4200.ex02;

import org.pg4200.les02.list.MyList;

public class MyBidirectionalLinkedList<T> implements MyList<T> {

    private class Node{
        T value;
        Node next;
        Node previous;

        public Node(T value){
            this(value, null, null);
        }
        public Node(T value, Node next, Node previous){
            this.value = value;
            this.next = next;
            this.previous = previous;
        }
    }

    Node head = null;
    Node tail = null;
    protected int size = 0;



    public MyBidirectionalLinkedList(){}

    //Adds at the end of the list
    public void add(T value) {
        add(size, value);
    }

    public void add(int index, T value) {

        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Kan ikke plassere index større enn lista");

        } else if(index == size) {
            //If place in the back
            if(head == null){

                head = new Node(value); //Next & Previous = null by default
                tail = head;

            } else {
                //If the list consists of elements, place last (position "size")
                Node newNode = new Node(value);
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;

            }

        } else if(index == 0) {
            //If place in the front
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;

        }  else {
            //If place in the middle
            Node newNode = new Node(value);
            Node previousNode;
            Node nextNode;

            if (index <= middle()) {
                previousNode = head;

                for (int i = 0; i < index - 1; i++) {
                    previousNode = previousNode.next;
                }

                nextNode = previousNode.next;

            } else {
                nextNode = tail;

                for (int i = size; i > index + 1; i--) {
                    nextNode = nextNode.previous;
                }

                previousNode = nextNode.previous;
            }

            previousNode.next = newNode;
            nextNode.previous = newNode;
            newNode.previous = previousNode;
            newNode.next = nextNode;
        }

        size++;
    }

    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Kan ikke slette en index som ikke finnes");
        } else if(size == 1) {
            //Only one element (deleting the last) Also index == 0 must be
            head = null;
            tail = null;

        } else if(index == 0) {
            //Delete first element -- Old head is taken by GB
            head = head.next;

        } else if(index == size -1) {
            //Delete last element -- Old tail is taken by GB
            tail = tail.previous;

        } else {
            //Delete element in the middle
            Node node;
            if(index < middle()){
                node = head;

                //Looping until the wanted index node
                for(int i = 0; i < index; i++) {
                    node = node.next;
                }

            } else {
                node = tail;

                //Looping until the wanted index node
                for(int i = size - 1; i > index; i--) {
                    node = node.previous;
                }
            }
            //Both switching their pointers to each other
            node.previous.next = node.next;
            node.next.previous = node.previous;
        }
        size--;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Kan ikke hente index som ikke finnes");

        } else if(index == 0) {
            //Get first element
            return head.value;

        } else if(index == size -1) {
                //Get last element
                return tail.value;
        } else {
            //Get element in the middle
            Node node;
            if(index < middle()){
                node = head;

                for(int i = 0; i < index; i++) {
                    node = node.next;
                }

            } else {
                node = tail;

                for(int i = size - 1; i > index; i--) {
                    node = node.previous;
                }
            }

            return node.value;
        }
    }

    public int size() {
        return size;
    }

    public int middle() {
        return (size % 2) + (size / 2);
    }
}
