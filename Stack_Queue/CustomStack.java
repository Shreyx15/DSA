package com.company.Stack_Queue;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

     int top = -1;
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public boolean push(int item) throws Exception{
        if(isFull()) {
            throw new Exception("Stack is Full! Try using dynamicPush.");
        }

        top++;
        data[top] = item;
        return true;
    }

    public void dynamicPush(int item) throws Exception{
        if(isFull()) {
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;

        } else {

            push(item);
        }



    }
    private boolean isFull() {
        if(top == data.length - 1) {
            return true;
        }
        return false;
    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("Stack is Empty!");
        }

        top--;
        return data[top + 1];
    }

    private boolean isEmpty() {
        if(top == -1) {
            return true;
        }
        return false;
    }


    public void display() {
        while(!this.isEmpty()) {
            int n;
            try {
                n = this.pop();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            System.out.println(n);
//            top--;
        }

    }
}
