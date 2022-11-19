package com.demo.exmp.sort;

public class BogoSort {
    public static void main(String[] args) {
        int[] a = { 3, 2, 5, 1, 0, 4 };

        BogoSort ob = new BogoSort();
        ob.bogoSort(a);
        System.out.print("BogoSort: ");
        ob.printArray(a);
    }
    public void bogoSort(int[] a) {
        int counter = 0;
        while (!isSorted(a)) {
            shuffle(a);
            counter++;
        }
        System.out.println("Shuffled " + counter + " times");
    }

    private void print(int[] a) {
        for(int x : a) {
            System.out.print(x + ", ");
        }
        System.out.println();
    }

    public static void shuffle(int[] a){
         for (int i = 0; i < a.length; i++)
                swap(a, i, (int)(Math.random() * i));
        }
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        }
    public static boolean isSorted(int[] a){
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i - 1])
                return false;
        return true;
        }
    public void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
        }
}