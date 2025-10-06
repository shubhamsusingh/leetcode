package LinkedList.DSUDEMY.SinglyLinkedList;

public class Main {
    // Question 1:-Find Middle Node
    public static LinkedListDemo.Node findMiddle(LinkedListDemo list) {
        LinkedListDemo.Node fast = list.head;
        LinkedListDemo.Node slow = list.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    // Quetion 2:- Has a Loop
    public static boolean hasLoop(LinkedListDemo list) {
        LinkedListDemo.Node slow = list.head;
        LinkedListDemo.Node fast = list.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Question 3:-Find Kth Node form last:-
    public static LinkedListDemo.Node findKthNodeFromLast(LinkedListDemo list, int k) {
        LinkedListDemo.Node slow = list.head;
        LinkedListDemo.Node fast = list.head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    // Question 4:-Remove duplicates:
    public static void removeDuplicates(LinkedListDemo list) {
        LinkedListDemo.Node current = list.head;
        while (current != null) {
            LinkedListDemo.Node prev = current;
            LinkedListDemo.Node runner = current.next;
            while (runner != null) {
                if (runner.data == current.data) {
                    prev.next = runner.next;
                    list.length--;
                } else {
                    prev = prev.next;
                }
                runner = runner.next;
            }
            current = current.next;

        }
    }

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
        LinkedListDemo.Node middle = findMiddle(list1);
        System.out.println("\n" + middle.data);
        System.out.println(hasLoop(list1));
        System.out.println(findKthNodeFromLast(list1, 1).data);

        list1.append(1);
        list1.printList();
        removeDuplicates(list1);
        list1.printList();
    }
}
