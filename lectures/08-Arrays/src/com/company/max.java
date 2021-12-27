package com.company;

public class max {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15};

        System.out.println("The Max Value is: " + max(arr));
    }

    static int max(int[] arr) {
       int maxVal = arr[0];
        for (int i = 1; i < arr.length ; i++) {  //initializing
            if (i< arr[0]){
                maxVal = arr[i];
                /*
                First we declared the maxVal to be arr[0] after that we initialised and
                to check we used condition statement that if i is greater than the value of arr[0]
                the maxVal will be replaced with that value giving the maxVal
                If the maxVal was arr[0] then it will run and go forward.
                 */
            }
        }
        return maxVal;
    }
}
