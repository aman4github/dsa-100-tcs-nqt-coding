package com.aman.tcs.dsa.array;

public class SmallestInAnArray {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5};
        int ele = Integer.MAX_VALUE;

        for (int i : arr) {
            if (i < ele) {
                ele = i;
            }
        }

        System.out.println("Min Element : " + ele);
    }
}
