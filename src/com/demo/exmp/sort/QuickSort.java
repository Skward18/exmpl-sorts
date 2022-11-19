package com.demo.exmp.sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {100, 77, 18, 59, 41, 35 };
        int n = array.length;

        quickSort(array, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(array, n);
    }
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);

            }
        }
        swap(array, i + 1, high);
        return (i + 1);
    }
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }
    public static void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}
