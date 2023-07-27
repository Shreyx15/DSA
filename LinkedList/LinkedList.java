package com.company.LinkedList;


public class LinkedList<I extends Number> {
    public static void main(String[] args) {
        Node list = new Node();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(-3);
        list.insertLast(3);
        list.insertLast(1);

//        list.display();
        list.removeZeroSumSublists();
    }
}
