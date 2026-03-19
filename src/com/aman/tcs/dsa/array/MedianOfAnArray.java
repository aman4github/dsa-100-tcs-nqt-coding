package com.aman.tcs.dsa.array;

public class MedianOfAnArray {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2, 5, 6};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int len = arr.length;

        if (len % 2 == 0) {
            System.out.println("Median = " + (double) (arr[len/2] + arr[(len/2)-1]) / 2);
        } else {
            System.out.println("Median = " + arr[len/2]);
        }
    }
}
