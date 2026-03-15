package com.aman.tcs.dsa.array;

import java.util.Arrays;

public class RotateArrayByKElements {
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void leftRotate(int[] arr, int rotations) {
        int len = arr.length;

        rotations %= len;

        reverse(arr, 0, rotations-1);
        reverse(arr, rotations, len-1);
        reverse(arr, 0, len-1);
    }

    public static void rightRotation(int[] arr, int rotations) {
        int len = arr.length;

        rotations %= len;

        reverse(arr, 0, len-1);
        reverse(arr, 0, rotations-1);
        reverse(arr, rotations, len-1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2;

//        leftRotate(arr, n);

        rightRotation(arr, n);

        System.out.println(Arrays.toString(arr));
    }
}
