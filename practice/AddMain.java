package practice;

public class AddMain {
    public static void main(String[] args) {
        AddTwoNumbers AT = new AddTwoNumbers();
        AT.append(0);
        AT.append(1);
        AT.append(2);
        AT.append(3);
        AT.append(4);
        AT.printLL();
        AddTwoNumbers AT1 = new AddTwoNumbers();
        AT1.append(5);
        AT1.append(8);
        AT1.append(10);
        AT1.append(11);
        AT1.append(12);
        System.out.println("AT 1:-");
        AT1.printLL();
        System.out.println("SUMED:-");
        AddTwoNumbers.Node head = AT.addtwoNumbers(AT.getHead(), AT1.getHead());
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        AT.removeNthFromLAst(AT.getHead(), 2);
        System.out.println("this");
        AT.printLL();
        AddTwoNumbers.Node sortedNode = AT.mergeSortedList(AT.getHead(), AT1.getHead());
        System.out.println("sorted");
        while (sortedNode != null) {
            System.out.print(sortedNode.val);
            sortedNode = sortedNode.next;
        }
        // System.out.println(AT.addtwoNumbers(AT.getHead(), AT1.getHead()).next.val);
    }
}
