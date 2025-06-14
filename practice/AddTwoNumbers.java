package practice;

public class AddTwoNumbers {
    private Node head;
    private Node tail;
    int length = 0;

    public class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
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
    }

    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node getHead() {
        return head;
    }

    public Node addtwoNumbers(Node l1, Node l2) {
        Node dummyNode = new Node(0);
        Node current = dummyNode;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = 0;
            int y = 0;
            if (l1 != null) {
                x = l1.val;
            }
            if (l2 != null) {
                y = l2.val;
            }
            int sum = x + y + carry;
            carry = sum / 10;
            current.next = new Node(sum % 10);
            current = current.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return dummyNode.next;
    }

    public Node removeNthFromLAst(Node head, int n) {
        Node dummy = new Node(0);
        dummy.next = head;
        Node first = head;
        Node second = head;
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    public Node mergeSortedList(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node current = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;

            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 != null) {
            current.next = l1;
            l1 = l1.next;
        }
        if (l2 != null) {
            current.next = l2;
            l2 = l2.next;
        }
        return dummy.next;
    }
}
