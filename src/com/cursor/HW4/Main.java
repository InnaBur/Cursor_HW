package com.cursor.HW4;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        MyList<Integer> array = new MyList<>();

        array.add(25);
        array.add(12);
        array.add(-7);
        array.add(1);
        array.add(77);
        array.add(34);

        array.printArray();

        System.out.println("The largest element in array is " + array.largest());
        System.out.println("The smallest element in array is " + array.smallest());
    }
}
