package SortingOnArray;

public class Sorting {
    public void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp1 = i;
            int j;
            for (j = i + 1; j < array.length; j++) {
                if (array[j] < array[temp1]) {
                    temp1 = j;
                }
            }
            if (temp1 != i) {
                j = array[temp1];
                array[temp1] = array[i];
                array[i] = j;

            }
        }
    }
}
