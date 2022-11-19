package com.demo.exmp.sort;

import java.util.Arrays;

import static com.demo.exmp.sort.InsertionSort.insertionSort;

public class GnomeSort {
    public static void main(String[] args) {
        int array[] = { 9, 4, 7, 3};

        gnomeSort(array, array.length);

        System.out.print("GnomeSort: ");
        System.out.println(Arrays.toString(array));
    }
    public static void gnomeSort(int array[], int n){
        int i = 0;

        while (i < n) {
            if (i == 0)
                i++;
            if (array[i] >= array[i - 1])
                i++;
            else {
                int temp = 0;
                temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                i--;

            }
        }
        return;
    }
}