package com.company;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = { 1, 2 , 3 , 4 , 5 };
        int target = 3;
        //If given something outside the range it will give you -1
        //Here we have given the start and end range to begin with which is 1 & 3.
        System.out.println(linearSearch(arr, target, 1 , 3 ));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = start; index <= end; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
