package com.aman.tcs.dsa.array;

import java.util.*;

public class RemoveElementFromAnUnsortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1, 3, 4, 5, 5, 3, 4};

        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, true);
            }
        }

        for (Map.Entry<Integer, Boolean> m : map.entrySet()) {
            System.out.print(m.getKey() + " ");
        }

        System.out.println();

        for (int i : map.keySet()) {
            System.out.print(i + " ");
        }
    }
}
