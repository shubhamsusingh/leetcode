package LinkedList.DSUDEMY.SinglyLinkedList;

public class LinkedListDemo {
    Node head;
    Node tail;
    int length = 0;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void preAppend(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public boolean insertAt(int index, int data) {
        if (index < 0 || index >= length) {
            return false;
        }
        if (index == 0) {
            preAppend(data);
            return true;
        } else if (index == length - 1) {
            append(data);
            return true;
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
            return true;
        }
    }

    public Node getHead() {
        return head;
    }

    public void printList() {
        Node temp = head;
        System.out.println("\n");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}
