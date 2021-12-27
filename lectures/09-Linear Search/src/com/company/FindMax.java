package com.company;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {12 , 44, -999, 25, 19};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int ans2 = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans2) {
                ans2 = arr[i];
            }

        }
        return ans2;
    }
}

