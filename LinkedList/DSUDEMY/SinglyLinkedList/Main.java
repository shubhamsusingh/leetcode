package LinkedList.DSUDEMY.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedListDemo list1 = new LinkedListDemo();
        list1.append(1);
        list1.append(2);
        list1.append(3);
        list1.append(4);
        list1.printList();
        list1.preAppend(0);
        list1.printList();
        list1.insertAt(2, 5);
        list1.printList();
    }
}
