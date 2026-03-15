package com.aman.tcs.dsa.array;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 2, 4, 4, 5, 5, 6};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> i : map.entrySet()) {
            System.out.println(i.getKey() + " -> " + i.getValue());
        }
    }
}
