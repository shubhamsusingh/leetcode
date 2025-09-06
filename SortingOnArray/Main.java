package SortingOnArray;

public class Main {
    public static void main(String[] args) {
        Sorting s = new Sorting();
        int[] num = { 1, 4, 2, 6, 3, 5 };
        s.bubbleSort(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }
        int[] num1 = { 1, 6, 2, 5, 3, 1, 4 };
        System.out.println("");
        s.selectionSort(num1);
        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i]);
        }
    }
}
