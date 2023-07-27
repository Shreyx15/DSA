package com.company.LinkedList;

public class CLL {
    private int value;
    private CLL next;
    private CLL head;
    private CLL tail;
    private int size = 0;

    public CLL(int value) {
        this.value = value;
    }

    public CLL(int val, CLL next) {
        this.value = val;
        this.next = next;
    }

    public CLL() {

    }

    public void insertFirst(int val) {
        CLL node = new CLL(val);
        head = node;
        node.next = head;
        tail = node;

        size++;
    }

    public void insertLast(int val) {
        if(head == null) {
            insertFirst(val);
            return;
        }
        CLL node = new CLL(val);
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void insert(int index, int val) {
        if(index == 0) {
            insertFirst(val);
            return;
        }

        if(index == size) {
            insertLast(val);
            return;
        }

        CLL temp = head;

        for (int i = 1; i < index ; i++) {
            temp = temp.next;
        }

        CLL prev = temp;
        CLL next = temp.next;

        CLL node = new CLL(val, next);
        prev.next = node;
        size++;

    }

    public void deleteFirst() {
        if(head == null) {
            return;
        }

        CLL temp = head;
        head = temp.next;
        tail.next = head;
        temp.next = null;
        size--;
    }

    public void deleteLast() {
        if(head == null) {
            return;
        }

        CLL temp = head;
        while(temp.next != tail) {
            temp = temp.next;
        }
        CLL prev = temp;
        prev.next = head;
        tail = prev;
        size--;

    }

    public void delete(int index) {
        if(index == 0) {
            deleteFirst();
            return;
        }

        if(index == size) {
            deleteLast();
        }

        CLL temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        CLL prev = temp;
        CLL next = temp.next.next;

        prev.next = next;

        size--;
    }

    public int getSize() {
        return this.size;
    }

    public void display() {
        CLL temp = head;
        while (temp != tail) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print(temp.value  + " -> "+ head.value + " -> " + "END");
    }


}
