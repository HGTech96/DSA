package datastructures.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public LinkedList(int value) {
        Node node = new Node(value);
        this.head = node;
        this.tail = node;
        this.length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value);
            System.out.print(' ');
            temp = temp.next;
        }
        System.out.println();
    }

    public void getInfo() {
        getHead();
        getTail();
        getLength();
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;

        } else {
            tail.next = newNode;
        }
        tail = newNode;
        length++;
    }

    public Node pop() {
        if (length == 0)
            return null;

        Node temp = head;
        Node pre = temp;
        while (temp.next != null) {
            temp = temp.next;
            if (temp.next != null) {
                pre = temp;
            }
        }
        tail = pre;
        pre.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }

        return temp;
    }

    public void prepend(int value) {
        Node newItem = new Node(value);
        if (head == null && tail == null) {
            head = newItem;
            tail = newItem;
        } else {
            newItem.next = head;
            head = newItem;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }


    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

}
