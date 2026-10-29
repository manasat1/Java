interface Iterator {
    Object next();
    boolean hasNext();
}

class Stack implements Iterator {
    private int[] st = new int[10];
    private int top = -1;

    public void push(int val) {
        st[++top] = val;
    }

    public Object next() {
        return st[top--];
    }

    public boolean hasNext() {
        return top >= 0;
    }
}

class Queue implements Iterator {
    private int[] qu = new int[10];
    private int rear = -1;
    private int front = 0;

    public void enqueue(int val) {
        qu[++rear] = val;
    }

    public Object next() {
        return qu[front++];
    }

    public boolean hasNext() {
        return front <= rear;
    }
}

class LinkedList implements Iterator {
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node first;
    private Node last;

    public void add(int val) {
        Node node = new Node(val);

        if (first == null) {
            first = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
    }

    public Object next() {
        int value = first.data;
        first = first.next;
        return value;
    }

    public boolean hasNext() {
        return first != null;
    }
}

class InterfaceStackQueueLinkedList {

    public static void main(String[] args) {

        Iterator itr;

        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);

        Queue q = new Queue();
        q.enqueue(110);
        q.enqueue(120);
        q.enqueue(130);

        LinkedList l = new LinkedList();
        l.add(100);
        l.add(200);
        l.add(300);

        System.out.println("Stack:");
        itr = s;
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Queue:");
        itr = q;
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Linked List:");
        itr = l;
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
