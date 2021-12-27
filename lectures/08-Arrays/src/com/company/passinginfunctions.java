package com.company;

import java.util.Arrays;

public class passinginfunctions {
    public static void main(String[] args) {

        // Arrays are mutable in nature and Strings are immutable
        int[] nums ={ 3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0] = 99;
    }
}
