package Question;

public class Question {

    // Delete kth Node from Last
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
}
