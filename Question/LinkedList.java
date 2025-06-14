package Question;

public class LinkedList {
    public Node head;
    public Node tail;
    public int length;

    class Node {
        Node next;
        int val;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public LinkedList(int val) {
        Node newNode = new Node(val);
        head = tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public void append(int val) {
        Node newNode = new Node(val);
        if (length == 0) {
            head = tail = newNode;

        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
        return;
    }

    public void preAppend(int val) {
        Node newNode = new Node(val);
        if (length == 0) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
        return;
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + ",");
            temp = temp.next;
        }
    }
}
