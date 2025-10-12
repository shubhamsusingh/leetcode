package LinkedList.DSUDEMY.DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(2);
        list1.append(3);
        list1.printList();
        list1.preAppend(0);
        list1.printList();
        list1.insertAt(2, 6);
        list1.printList();
        list1.set(2, 12);
        list1.printList();
    }
}
