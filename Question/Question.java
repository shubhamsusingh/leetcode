package Question;

// import java.lang.classfile.components.ClassPrinter.ListNode;

public class Question {

    // kth Node from Last
    public LinkedList.Node KthNodefromlast(LinkedList.Node head, int k) {
        LinkedList.Node first = head;
        LinkedList.Node second = head;
        for (int i = 0; i < k; i++) {
            if (first == null) {
                return null;
            }
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        return second;
    }

    // Delete Kth Node from Last
    public LinkedList.Node deleteKthFromLast(LinkedList.Node head, int k) {
        LinkedList list = new LinkedList(0); // just for creating inner Node
        LinkedList.Node dummy = list.new Node(0);
        dummy.next = head;
        LinkedList.Node first = head;
        LinkedList.Node second = head;
        for (int i = 0; i <= k; i++) {
            if (first == null) {
                return null;
            }
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        LinkedList.Node delete = second.next;
        // delete.next = null;
        second.next = second.next.next;
        return delete;

    }

    public LinkedList.Node reverse(LinkedList.Node head) {
        LinkedList.Node prev = null;
        while (head != null) {
            LinkedList.Node tempNext = head.next;
            head.next = prev;
            prev = head;
            head = tempNext;
        }

        return prev;

    }

    // Check Pelindrome:-
    public boolean isPelindrome(LinkedList.Node head) {
        if (head == null || head.next == null) {
            return true;
        }
        LinkedList.Node fast = head;
        LinkedList.Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

        }
        LinkedList.Node secondPart = reverse(slow);
        LinkedList.Node firstPart = head;
        while (secondPart != null) {
            if (firstPart.val != secondPart.val) {
                return false;
            }
            firstPart = firstPart.next;
            secondPart = secondPart.next;
        }
        return true;

    }

    // Merege two sorted List:-
    public LinkedList.Node mergeSortedArray(LinkedList.Node l1, LinkedList.Node l2) {
        LinkedList list = new LinkedList(0);
        LinkedList.Node dummy = list.new Node(0);
        LinkedList.Node current = dummy;
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

    // remove duplicates:-
    public void removeDuplicates(LinkedList.Node head) {
        if (head == null) {
            return;
        }
        LinkedList.Node currrent = head;
        while (currrent != null) {
            LinkedList.Node prev = currrent;
            LinkedList.Node runner = currrent.next;
            while (runner != null) {
                if (runner.val == currrent.val) {
                    prev.next = runner.next;
                } else {
                    prev = prev.next;
                }
                runner = runner.next;
            }
            currrent = currrent.next;
        }
    }

    // check loop
    public boolean hasLoop(LinkedList.Node head) {
        LinkedList.Node fast = head;
        LinkedList.Node slow = head;
        while (fast != null && fast.next != null) {
            if (fast == slow) {
                return true;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }

    // return n Node :-
    public LinkedList.Node returnNode(LinkedList.Node head, int n) {
        LinkedList.Node temp = head;
        for (int i = 0; i < n; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // remove the Element from linkedList:-
    public LinkedList.Node removeElement(LinkedList.Node head, int val) {
        LinkedList list = new LinkedList(0);
        LinkedList.Node dummy = list.new Node(0);
        dummy.next = head;
        LinkedList.Node temp = dummy;
        while (temp != null && temp.next != null) {
            if (temp.next.val == val) {
                LinkedList.Node deletedNode = temp.next;
                temp.next = temp.next.next;
                deletedNode.next = null;
            } else {
                temp = temp.next;
            }
        }
        return dummy.next;

    }

    public int binaryTodecimal(LinkedList.Node head) {
        int sum = 0;
        LinkedList.Node temp = head;
        while (temp != null) {
            sum = sum * 2 + temp.val;
            temp = temp.next;
        }
        return sum;
    }
}
