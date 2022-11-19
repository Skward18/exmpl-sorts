package com.demo.exmp.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int h[] ={55,164,14,51,45,320,121};

        bubbleSort(h);
        System.out.println("Bubble Sort: ");
        for(int i=0; i < h.length; i++){
            System.out.print(h[i] + " ");
        }
    }
    public static void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;


                }
            }
        }
    }
}