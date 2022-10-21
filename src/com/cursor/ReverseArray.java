package com.cursor;

import java.util.Arrays;

/**
 * In this class the given array is reversed
 * in descending order
 */
public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 7, 11};
        System.out.println("The array is: " + Arrays.toString(arr));
        /* we loop through the array, and compare the element
         * with the next element, and swap them if the first is smaller than the next
         */

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //printing results using Arrays method
        System.out.println("The reversed array is: " + Arrays.toString(arr));
    }
}
