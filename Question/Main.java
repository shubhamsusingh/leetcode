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

    }
}
