package com.aman.tcs.dsa.array;

public class SecondSmallestAndLargest {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 4, 5};

        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > largest) {
                secondLargest = largest;
                largest = i;
            } else if (i > secondLargest && i < largest) {
                secondLargest = i;
            }

            if (i < smallest) {
                secondSmallest = smallest;
                smallest = i;
            } else if (i < secondSmallest && i > smallest) {
                secondSmallest = i;
            }
        }

        System.out.println("Second Largest : " + secondLargest);
        System.out.println("Second Smallest : " + secondSmallest);
    }
}
