package com.demo.exmp.sort;

public class SelectionSort {
    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        int array[] = {64,25,12,32,41};
        ob.sort(array);
        System.out.println("SelectionSort: ");
        ob.printArray(array);
    }
    public static void sort(int array[]) {
        int n = array.length;
        int counter = 0;
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++)
                if (array[j] < array[min_index])
                    min_index = j;

            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
            counter++;
        }
        System.out.println("Shuffled " + counter + " times");
    }

    public static void printArray(int array[])
    {
        int n = array.length;
        for (int i=0; i<n; ++i)
            System.out.print(array[i]+" ");
        System.out.println();
    }
}
