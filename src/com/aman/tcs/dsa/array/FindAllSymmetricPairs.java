package com.aman.tcs.dsa.array;

import java.util.HashMap;

public class FindAllSymmetricPairs {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2},
                {2, 1},
                {3, 4},
                {4, 5},
                {5, 4}
        };

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int[] i : arr) {
            int first = i[0];
            int second = i[1];

            if (map.containsKey(second) && map.get(second) == first) {
                System.out.println("(" + first + ", " + second +")");
            } else {
                map.put(first, second);
            }
        }
    }
}
