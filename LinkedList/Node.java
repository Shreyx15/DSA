package com.company.LinkedList;

public class Node {
    private int value;
    private Node next;
    private Node head;
    private Node tail;

    
    private int size = 0;

    public void removeZeroSumSublists() {
        Node dummy = new Node(0);
        Node curr = head;
        Node prev = head;
        Node tail = dummy;

        while(curr != null && curr.next != null) {
            if(prev.value + curr.value == 0) {
                prev = curr.next;
            } else {
                tail.next = prev;
                tail = tail.next;
            }


            prev = curr;
            curr = curr.next;
        }

        Node list = dummy.next;

        list.display();

    }
    public boolean hasCycle() {
        Node fast = this.head;
        Node slow = this.head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) {
                return true;
            }
        }
    return false;}
    public Node startNode() {
        Node fast = this.head;
        Node slow = this.head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) {
                int length = cycleLength(slow);
                break;
            }
        }
        Node s = slow;
        Node f = head;

        while(s != f) {
            f = f.next;
            s = s.next;

        }
        return s;

       }


    public int cycleLength(Node head) {
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) {
                Node temp = slow.next;
                int length = 1;

                while(temp != slow) {
                    length++;
                    temp = temp.next;
                }
            return length;}
        }
    return 0;}
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if(head == null) {
            insertFirst(val);
            return;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void insertAtIndex(int index, int val) {
        if(index == 0) {
            insertFirst(val);
            return;
        }
        if(index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public void insertRec(int index, int val) {
        Node node = head;
        insertRec(index, val, node);
    }

    private Node insertRec(int index, int val, Node curr) {
        if(index == 0) {
            Node newNode = new Node(val, curr);
            return newNode;
        }

        Node temp = insertRec(--index, val, curr.next);

        curr.next = temp;
        return curr;

    }

    public Node reverse() {
        Node curr = head;
        Node prev = null;
        return reverse(prev, curr);
    }

    public Node reverse(Node prev, Node curr) {
        if(curr.next == null) {
            curr.next = prev;
            head = curr;
            return prev;
        }

        Node ans = reverse(curr, curr.next);
        ans.next = prev;

        return prev;
    }

    public Node getHead() {
        return head;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void deleteFirst() {
        if(head == tail) {
            head = tail = null;
            size = 0;
            return;
        }

        Node temp = head;
        head = head.next;
        temp = null;

        size--;
    }


    public void deleteLast() {
        Node temp = head;
        for (int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;

    }

    public void deleteAtIndex(int index) {
        if(index == 0) {
            deleteFirst();
            return;
        }
        if(index == size) {
            deleteLast();
            return;
        }

        Node prev = getNode(index - 1);
        Node next = getNode(index + 1);
        prev.next = next;
        size--;


    }

    public Node getNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
    return node.value;}

    public int size() {
        return size;
    }


    public Node removeNthFromEnd(int n) {
        Node curr = head;
        Node prev = null;
        Node node = head;
        int length = 0;

        while(node != null) {
            node = node.next;
            length++;
        }

        //System.out.print(length);
        for(int i = 0; i < length - n; i++) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = curr.next;



        return head;
    }
    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }
    public Node() {}
    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}

