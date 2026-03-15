package com.aman.tcs.dsa.array;

import java.util.Arrays;

public class RearrangingArrayInIncAndDecOrder {
    public static void main(String[] args) {
//        int[] arr = {8, 7, 1, 6, 5, 9};
        int[] arr = {4, 2, 8, 6, 15, 5, 9, 20};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int start = arr.length/2, end =  arr.length-1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
}
