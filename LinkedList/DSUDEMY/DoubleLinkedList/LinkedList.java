package LinkedList.DSUDEMY.DoubleLinkedList;

public class LinkedList {
    Node head;
    Node tail;
    int length;

    class Node {
        Node next;
        Node prev;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
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
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public boolean insertAt(int index, int data) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            preAppend(data);
            return true;
        } else if (index == length) {
            append(data);
            return true;
        } else {
            Node temp = head;
            Node newNode = new Node(data);
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
            length++;
            return true;

        }
    }

    public Node removeFirst() {
        if (head == null) {
            return null;
        }
        Node temp = head;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }

        length--;
        return temp;
    }

    public Node removeLast() {
        if (head == null) {
            return null;
        }
        Node temp = tail;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;

    }

    public Node removeAt(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node deleted = temp.next;
        temp.next = temp.next.next;
        temp.next.prev = temp;
        deleted.next = null;
        deleted.prev = null;
        length--;
        return deleted;
    }

    public void printList() {
        System.out.println(" ");
        if (head == null) {
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            return head;
        } else if (index == length - 1) {
            return tail;
        }
        Node temp;
        if (index < length / 2) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
            return temp;
        }
    }

    public boolean set(int index, int data) {
        Node temp = get(index);
        if (temp == null) {
            return false;
        }
        temp.data = data;
        return true;
    }
}
