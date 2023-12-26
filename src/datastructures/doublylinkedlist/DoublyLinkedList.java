package datastructures.doublylinkedlist;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
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

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append (int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    // WRITE SWAPFIRSTLAST METHOD HERE //
    //                                 //
    //                                 //
    //                                 //
    //                                 //
    /////////////////////////////////////
    public void swapFirstLast() {

        if(length >= 2) {
            int temp = tail.value;
            tail.value = head.value;
            head.value = temp;

        }
    }

    public void reverse() {
        Node pointerHead = head;
        Node pointerTail = tail;

        while (true) {
            int temp = pointerHead.value;
            pointerHead.value = pointerTail.value;
            pointerTail.value = temp;
            if(pointerHead.next == pointerTail)
                break;
            pointerHead = pointerHead.next;
            pointerTail = pointerTail.prev;
            printList();

        }
    }
    public boolean isPalindrome() {
        Node pointerTail = tail;
        Node pointerHead = head;
        while(pointerHead != pointerTail) {
            if(pointerHead.value != pointerTail.value) {
                return false;
            }
            pointerHead = pointerHead.next;
            pointerTail = pointerTail.prev;

        }
        return true;
    }
}


