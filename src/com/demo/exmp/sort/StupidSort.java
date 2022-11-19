package com.demo.exmp.sort;

public class StupidSort {
    public static void main(String[] args) {
        int[] i = {1, 10, 2, 8, 5, 3, 4, 9, 6, 7, 66};
        new StupidSort(i);
    }
    public StupidSort(int[] i) {
        int counter = 0;
        System.out.println("I'll sort " + i.length + " elements! WAIT!");
        while(!isSorted(i)) {
            shuffle(i);
            counter++;
        }
        System.out.println("Done! (shuffled " + counter + " times)");
        print(i);
    }
    private static void print(int[] i) {
        for(int x : i) {
            System.out.print(x + ", ");
        }
        System.out.println();
    }
    private static void shuffle(int[] i) {
        for(int x = 0; x < i.length; ++x) {
            int index1 = (int) (Math.random() * i.length),
                    index2 = (int) (Math.random() * i.length);
            int a = i[index1];
            i[index1] = i[index2];
            i[index2] = a;
        }
    }
    private static boolean isSorted(int[] i) {
        for(int x = 0; x < i.length - 1; ++x) {
            if(i[x] > i[x+1]) {
                return false;
            }
        }
        return true;
    }
}