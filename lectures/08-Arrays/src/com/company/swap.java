package com.company;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        // Swapping 2 numbers

         int [] arr = {11, 12, 13, 14, 15};
         //swap(arr, 1, 3);

        reverse(arr); // printing the reverse: reverse(name)
       // [15, 14, 13, 12, 11]

        System.out.println(Arrays.toString(arr));
        //[11, 14, 13, 12, 15]

    }
    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while (start < end){   // if end comes before the start on indexes stop swapping
            swap(arr, start, end);
            start++; //start goes forward
            end--; // end comes backward
        }
    }
    static void swap(int arr[], int index1, int index3 ){
        int temp = arr[index1]; //created an empty file to save index1
        arr [index1] = arr[index3]; // Since index1 is empty we can sava index3 into index1
        arr [index3] = temp; // Since index3 is now empty we can save our index1 which is in our temp file to our index3 file
        // by there it will be swap the numbers when we print it.

    }
}
