package LinkedList.AddtwoNumbers;

import java.util.LinkedList;

public class LinkedListDemo {
    public void AddTwo() {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list3 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list2.add(10);
        list2.add(20);
        list2.add(30);
        System.out.println(list1);
        System.out.println(list2);
        int carry = 0;
        int i = 0, maxSize = list1.size() + list2.size();
        while (i < maxSize || carry != 0) {
            int x = i < list1.size() ? list1.get(i) : 0;
            int y = i < list2.size() ? list2.get(i) : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            list3.add(sum % 10);
            i++;
        }
        System.out.println(list3);
    }

    public static void main(String[] args) {
        LinkedListDemo demo = new LinkedListDemo();
        demo.AddTwo();
    }

}
