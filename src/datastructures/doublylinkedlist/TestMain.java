package datastructures.doublylinkedlist;

public class TestMain {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(5);
        doublyLinkedList.append(4);
//        doublyLinkedList.append(3);
//        doublyLinkedList.append(2);
//        doublyLinkedList.append(1);
//        doublyLinkedList.append(0);
//        doublyLinkedList.append(100);
        doublyLinkedList.printList();
//        doublyLinkedList.reverse();
        System.out.println(doublyLinkedList.isPalindrome());
        doublyLinkedList.append(4);
        doublyLinkedList.append(5);
        System.out.println(doublyLinkedList.isPalindrome());

        doublyLinkedList.printList();
    }
}
