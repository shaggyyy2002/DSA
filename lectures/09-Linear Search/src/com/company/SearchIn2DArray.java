package com.company;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 36;
        System.out.println(Arrays.toString(search(arr, target)));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr,int target){
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                if(arr[row][col] == target ){
                    return new int[]{row,col};
                }

            }
        }
        //If value not find return {-1, 1}
return new int[]{-1, 1};
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                if(arr[row][col] > max ){
                   max = arr[row][col];
                }
            }
        }
        //If value not find return max value
        return max;
    }
}
