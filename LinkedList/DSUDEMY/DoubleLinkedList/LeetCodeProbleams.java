package LinkedList.DSUDEMY.DoubleLinkedList;

public class LeetCodeProbleams {
    public static boolean checkckPelindrome(LinkedList list) {
        if (list.length <= 1) {
            return true;
        }
        LinkedList.Node forward = list.head;
        LinkedList.Node backward = list.tail;
        for (int i = 0; i <= list.length / 2; i++) {
            if (forward.data == backward.data) {
                return true;
            }
            forward = forward.next;
            backward = backward.prev;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(2);
        list1.append(1);
        list1.printList();
        System.out.println(checkckPelindrome(list1));
    }
}
