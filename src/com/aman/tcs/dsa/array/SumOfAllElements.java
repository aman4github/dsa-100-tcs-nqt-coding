package com.aman.tcs.dsa.array;

public class SumOfAllElements {
    public static void main(String[] args) {
        int[] arr = {4, 2, 8, 6, 15, 5, 9, 20};
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        System.out.println("Sum of all elements : " + sum);
    }
}
