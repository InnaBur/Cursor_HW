package com.cursor.HW2;

import java.util.Arrays;

/**
 * In this class we replace all duplicated values by 0.
 * Array {3,2,3,1,4,2,8,3}  Result should be  next:{3,2,0,1,4,0,8,0}
 */
public class Replace {
    public static void main(String[] args) {

        int[] arr = {3, 2, 3, 1, 4, 2, 8, 3};

        // This array is for checking:
        // int [] arr = {2,2,4,1,4,9,8,9};

        // Creating new empty array with length equals length of the first array
        int[] arr2 = new int[arr.length];

        /* i - the number of iterations over the array
         * j - element number
         */
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                    arr2[j] = arr[j];
                } else {
                    arr2[i] = arr[i];
                }
            }
        }
        System.out.println("New array without duplicated values (not including 0): " + Arrays.toString(arr2));
    }
}
