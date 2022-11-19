package com.demo.exmp.sort;

public class HeapSort {
    public static void main(String[] args) {
        int array[] = { 32, 64, 123, 53, 16, 27 };
        int N = array.length;

        HeapSort ob = new HeapSort();
        ob.sort(array);

        System.out.println("ArraySort");
        printArray(array);
    }
    public static void sort(int array[]){
        int N = array.length;

        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(array, N, i);

        for (int i = N - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }
    public static void heapify(int array[], int N, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < N && array[l] > array[largest])
            largest = l;

        if (r < N && array[r] > array[largest])
            largest = r;

        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapify(array, N, largest);

        }


    }
    public static void printArray(int array[]) {
        int N = array.length;

        for (int i = 0; i < N; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
