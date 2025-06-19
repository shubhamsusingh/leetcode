package Question;

public class Main {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList(0);
        Question Q = new Question();
        ls.append(1);
        ls.append(2);
        ls.append(3);
        ls.append(4);
        ls.append(5);
        ls.printLL();
        System.out.println(Q.KthNodefromlast(ls.getHead(), 4).val);
        System.out.println(Q.deleteKthFromLast(ls.getHead(), 4).val);
        ls.printLL();
        LinkedList ll = new LinkedList(1);
        ll.append(2);
        ll.append(14);
        System.out.println(Q.isPelindrome(ll.getHead()));
        LinkedList sList1 = new LinkedList(0);
        sList1.append(1);
        sList1.append(2);
        sList1.append(3);
        sList1.append(4);
        System.out.println("Sorted List 1: ");
        sList1.printLL();
        LinkedList sList2 = new LinkedList(0);
        sList2.append(4);
        sList2.append(14);
        sList2.append(24);
        sList2.append(44);
        System.out.println();
        System.out.println("Sorted List 2: ");
        sList2.printLL();
        LinkedList.Node sortedList = Q.mergeSortedArray(sList1.getHead(), sList2.getHead());
        // LinkedList.Node tempList = sortedList;
        System.out.println();
        while (sortedList != null) {
            System.out.print(sortedList.val + ",");
            sortedList = sortedList.next;

        }
        LinkedList list3 = new LinkedList(0);
        list3.append(2);
        list3.append(3);
        list3.append(3);
        LinkedList.Node list = list3.getHead();
        Q.removeDuplicates(list);
        System.out.println();

        while (list != null) {
            System.out.print(list.val + ",");
            list = list.next;

        }
        System.out.println(Q.hasLoop(list));
        LinkedList.Node nodeList = list3.getHead();
        System.out.println(Q.returnNode(nodeList, 1).val);
        LinkedList myList1 = new LinkedList(7);
        myList1.append(7);
        myList1.append(7);
        myList1.append(7);
        myList1.printLL();
        LinkedList.Node dummyNode = Q.removeElement(myList1.getHead(), 7);
        System.out.println(dummyNode != null ? dummyNode.val : "NOT");

        LinkedList binaryList = new LinkedList(0);
        binaryList.append(1);
        binaryList.append(1);
        binaryList.append(0);
        binaryList.printLL();
        int decimal = Q.binaryTodecimal(binaryList.getHead());
        System.out.println(decimal);

    }

}
