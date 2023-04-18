package datastructures;

import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;


public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.append(5);
//        ll.prepend(14);
//        ll.append(2);
        ll.printList();
        ll.set(0, 1);

        ll.insert(0, 15);
        ll.append(5);
        ll.printList();
        ll.reverse();
        ll.printList();
    }
}
