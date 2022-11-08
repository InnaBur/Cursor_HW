package com.cursor.HW4;

import java.util.ArrayList;

public class MyList<T extends Number> {

    ArrayList<T> numbers = new ArrayList<>();

    public void add(T nums) {
        numbers.add(nums);
    }

    public T largest() {
        T max = numbers.get(0);

        for (int i = 1; i < numbers.size(); i++) {
            if (max.intValue() < numbers.get(i).intValue()) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public T smallest() {
        T min = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (min.intValue() > numbers.get(i).intValue()) {
                min = numbers.get(i);
            }
        }
        return min;
    }

    public void printArray() {
        for (int i = 0; i < numbers.size(); i++) {
            numbers.get(i);
        }
        String s = numbers.toString();
        System.out.println("Array is: " + s);
    }
}
