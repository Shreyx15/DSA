package com.company.LinkedList;

public class DNode {
    private DNode node;
    private DNode next;
    private DNode prev;
    private int value;
    private DNode head;
    private DNode tail;
    private int size = 0;

    public DNode() {

    }

    public DNode(int val) {
        this.value = val;
    }

    public DNode(DNode next, DNode prev, int value) {
        this.next = next;
        this.prev = prev;
        this.value = value;
    }

    public void insertFirst(int val) {
        DNode node = new DNode(val);
        node.next = head;
        head = node;
        prev = null;

        if(tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        DNode node = new DNode(val);
        if(head == null) {
            insertFirst(val);
            return;
        }

        DNode temp = get(size - 1);
        temp.next = node;
        node.prev = temp;
        tail = node;
        node.next = null;
        size++;
    }

    public DNode get(int index) {
        DNode node = head;
        for (int i = 1; i <= index; i++) {
            node = node.next;
        }
        return node;
    }

    public int size() {
        return this.size;
    }

    public void display() {
        DNode node = head;
        while(node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.print("END\n");
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

        DNode temp = get(index);
        DNode prev = temp.prev;
        DNode node = new DNode(temp, temp.prev, val);
        prev.next = node;
        size++;
    }

    public void deleteFirst() {
        if(head == tail) {
            head = tail = null;
            size = 0;
            return;
        }

        DNode temp = head.next;
        DNode H = head;
        H.next = null;
        temp.prev = null;
        head = temp;
        H = null;

        size--;
    }

    public void deleteLast() {
        if(head == tail) {
            deleteFirst();
            return;
        }

        DNode last = get(size - 1);
        DNode prev = last.prev;

        prev.next = null;
        last.prev = null;
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
            return;
        }

        DNode temp = get(index);
        DNode prev = temp.prev;

        prev.next = temp.next;
        temp.next.prev = prev;
        temp.next = null;
        temp.prev = null;
        size--;

    }


    public void reverse() {
        DNode last = this.tail;

        while(last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("END");

    }
}










