package com.demo.exmp.sort;

public class Timsort {
    public static void main(String[] args) {
        int[] array = { -2, 7, 15, -14, 0, 15, 0, 7, -7, -4, -13, 5, 8, -14, 12 };
        int n = array.length;
        System.out.println("Given Array is");
        printArray(array, n);

        timSort(array, n);

        System.out.println("After Sorting Array is");
        printArray(array, n);
    }
    static int MIN_MERGE = 32;
    public static int minRunLength(int n) {
        assert n >= 0;
        int r = 0;
        while (n >= MIN_MERGE) {
            r |= (n & 1);
            n >>= 1;
        }
        return n + r;
    }
    public static void insertionSort(int[] array, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= left && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
    public static void merge(int[] array, int l, int m, int r) {
        int len1 = m - l + 1, len2 = r - m;
        int[] left = new int[len1];
        int[] right = new int[len2];
        for (int x = 0; x < len1; x++) {
            left[x] = array[l + x];
        }
        for (int x = 0; x < len2; x++) {
            right[x] = array[m + 1 + x];
        }
        int i = 0;
        int j = 0;
        int k = l;

        while (i < len1 && j < len2) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            }
            else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < len1) {
            array[k] = left[i];
            k++;
            i++;
        }
        while (j < len2) {
            array[k] = right[j];
            k++;
            j++;
        }
    }
    public static void timSort(int[] array, int n) {
        int minRun = minRunLength(MIN_MERGE);

        for (int i = 0; i < n; i += minRun) {
            insertionSort(array, i,
                    Math.min((i + MIN_MERGE - 1), (n - 1)));
        }
        for (int size = minRun; size < n; size = 2 * size) {
            for (int left = 0; left < n;
                 left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1),
                        (n - 1));
                if(mid < right)
                    merge(array, left, mid, right);
            }
        }
    }
    public static void printArray(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("\n");
    }
}
