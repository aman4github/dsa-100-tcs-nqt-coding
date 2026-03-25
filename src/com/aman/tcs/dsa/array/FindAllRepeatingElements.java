package com.aman.tcs.dsa.array;

import java.util.HashMap;
import java.util.Map;

public class FindAllRepeatingElements {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i)+1);
            }
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            if (m.getValue() > 1) {
                System.out.print(m.getKey() + " ");
            }
        }
    }
}
