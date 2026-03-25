package com.aman.tcs.dsa.array;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -12, 4, 5, 0};
        int sum = 1;
        int max = Integer.MIN_VALUE;
        int start = -1, end = -1;

        for (int i = 0; i < arr.length; i++) {
            sum *= arr[i];

            if (max < sum) {
                max = sum;
                end = i;
            }

            if (sum < 0) {
                start = i+1;
                sum = 1;
            }
        }

        System.out.println("Maximum Product : " + max);

        System.out.print("Sub Array : ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
