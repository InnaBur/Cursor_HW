package com.cursor.HW2;

import java.util.Arrays;

/** In this class we get an array of numbers
 * and return the average of a list of numbers in this array.
 */
public class ArrayAverage {
    public static void main(String[] args) {

        int[] arr = {2, 6, 9, 10, 100, -10};

        int average = 0;
        for (int j : arr) {
            average += j;
        }

        System.out.println("The array: " + Arrays.toString(arr));

        //printing result and cast it to double
        System.out.println("The average of a list of numbers in array is: " + (double) average/ arr.length);
    }
}
