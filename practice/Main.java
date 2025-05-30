// package LEETCODE.practice;
package practice;

public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist(0);
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.preAppend(11);
        list.printList();
        list.removeLast();
        // list.removeLast();
        list.removeFirst();
        System.out.println("this is removed Data : " + list.removeFirst());

        list.printList();
        System.out.println(list.get(3).value);
        list.set(4, 11);
        list.insert(1, 22);
        list.printList();
        list.reverse();
        list.printList();
    }
}
