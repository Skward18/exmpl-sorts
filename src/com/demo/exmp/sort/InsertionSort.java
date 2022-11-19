package com.demo.exmp.sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr1 = {9,54,3,2,73,11,58,77};

        insertionSort(arr1);

        System.out.println("InsertionSort:");
        for(int i:arr1){
            System.out.print(i+" ");
        }
    }
    public static void insertionSort(int array[]) {
        int n = array.length;

        for (int j = 1; j < n; j++) {
            int k = array[j];
            int i = j-1;

            while ( (i > -1) && ( array [i] > k ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = k;
        }
    }
}
