package datastructures;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;


public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
//        ll.getHead();
//        ll.getTail();
//        ll.getLength();
//
//        ll.printList();
//        Node poppedItem = ll.pop();
//        System.out.println(poppedItem.value);
//        ll.printList();
//
//        ll.append(5);
//        ll.printList();
//
//        ll.append(6);
//        ll.printList();

        ll.prepend(7);
        ll.printList();


    }
}
