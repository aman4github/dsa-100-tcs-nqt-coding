package com.aman.tcs.dsa.array;

import java.util.Arrays;
import java.util.HashMap;

public class ReplaceEachElementByItsRank {
    public static void main(String[] args) {
        int[] arr = {20, 15, 26, 2, 98, 6, 2};

        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = i; j < arr2.length; j++) {
                if (arr2[i] > arr2[j]) {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr2.length; i++) {
            map.putIfAbsent(arr2[i], i+1);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}
