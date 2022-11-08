package com.cursor.HW4_2;

public class Main {
    public static void main(String[] args) {

        MyListExt<Integer> numbers = new MyListExt<>();
        MyListExt<String> str = new MyListExt<>();

        numbers.add(12);
        numbers.add(10);
        numbers.add(5);

        str.add("December");
        str.add("October");
        str.add("May");

        numbers.printArray();
        str.printArray();

    }
}
