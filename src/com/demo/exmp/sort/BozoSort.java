package com.demo.exmp.sort;

import java.util.Random;

public class BozoSort {
    public static void main(String[] args) {
        int[] arMyValues = { 3, 2, 1, 5, 4 };
        BozoSort(arMyValues);
        System.out.println("BozoSort: ");

        for (int i = 0; i < 5; i++) {
            System.out.println("Element: " + i + " - " + arMyValues[i]);
        }
    }
    public BozoSort(int[] arMyValues) {

    }
    private static void BozoSort(int[] arValues) {
        int slot1 = 0;
        int slot2 = 0;
        int temp;


        Random rand = new Random();

        while (!isSorted(arValues)) {

            slot1 = rand.nextInt(arValues.length);
            slot2 = rand.nextInt(arValues.length);

            temp = arValues[slot1];
            arValues[slot1] = arValues[slot2];
            arValues[slot2] = temp;

            return ;
        }
    }
    private static boolean isSorted(int[] arValues) {
        for (int i = 0; i < arValues.length - 1; i++) {
            if (arValues[i] > arValues[i + 1]) {
                return false;
            }
        }
        return true;
    }
}