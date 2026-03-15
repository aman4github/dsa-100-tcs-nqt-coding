package com.aman.tcs.dsa.array;

public class LargestInAnArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5};

        int ele = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > ele) {
                ele = i;
            }
        }

        System.out.println("Max element : " + ele);
    }
}
