package com.company;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {19, 12, -3, -4, 15};
        System.out.println(min(arr));
    }
    // Let us assume arr.length != 0
    // return the maximum value in the array

    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }

        }
        return ans;
    }
}