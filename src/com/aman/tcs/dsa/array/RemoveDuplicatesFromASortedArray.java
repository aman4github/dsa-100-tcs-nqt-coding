package com.aman.tcs.dsa.array;

public class RemoveDuplicatesFromASortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};

        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[temp]) {
                int pos = arr[i];
                arr[i] = arr[temp+1];
                arr[temp+1] = pos;

                temp++;
            }
        }

        for (int i = 0; i <= temp; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
