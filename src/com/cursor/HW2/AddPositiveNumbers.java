package com.cursor.HW2;

/**
 * In this class we get an array of numbers(positive and negative numbers),
 * and return the sum of all the positive ones.
 * (If there are nothing to sum, sum should be 0)
 */
public class AddPositiveNumbers {

         public static void main(String[] args) {

            int[] arr = {10, -9, 15, 0, 22, -5, -2, 12};

            /* these arrays are for the checking */

            //int[] arr = {100, -2, -4, -5, -7};
            //int[] arr = {0};
            //int[] arr =  {-5, -7, -8, -9};

            /* we loop through the array, and compare the element
             * with the next element, and swap them if the first is smaller than the next
             */
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
               if (arr[i] > 0) {
                   sum += arr[i];
               }
            }
            //printing results
            System.out.println("The sum of all the positive numbers in array = " + sum);
        }
    }


