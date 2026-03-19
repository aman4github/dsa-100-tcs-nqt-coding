package com.aman.tcs.dsa.array;

public class AvgOfAllElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        System.out.println((arr.length > 0) ? "Average = " + sum/arr.length : "Array is empty");
    }
}
