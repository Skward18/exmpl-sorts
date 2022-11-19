package com.demo.exmp.sort;

public class ShellSort {
    public static void main(String args[]) {
        int array[] = {22, -34, 54, 12, 93};
        ShellSort ob = new ShellSort();
        ob.sort(array);

        System.out.println("ShellSort: ");
        printArray(array);
    }
    public static void printArray(int array[]) {
        int n = array.length;
        for (int i=0; i<n; ++i)
            System.out.print(array[i] + " ");
        System.out.println();
    }
    public static int sort(int array[]) {
        int n = array.length;

        for (int gap = n/2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
                    array[j] = array[j - gap];
                array[j] = temp;
            }
        }
        return 0;
    }
}
