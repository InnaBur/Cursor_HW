package com.cursor.HW4_2;

import java.util.ArrayList;

public class MyListExt<T extends Comparable> {

    ArrayList<T> val = new ArrayList<>();

    public void  add (T value) {
       val.add(value);
    }

    public ArrayList<T> getVal() {
        return val;
    }


    public void printArray() {
        System.out.println("Array: " + val);

    }
}
