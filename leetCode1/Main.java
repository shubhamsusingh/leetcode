package leetCode1;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(0);
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.append(6);
        list.append(7);
        list.printList();
        System.out.println(list.findMidNode().value);
        System.out.println(list.getSize());
        System.out.println(list.checkLoop());
    }
}
