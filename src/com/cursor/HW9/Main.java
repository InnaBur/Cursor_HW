package com.cursor.HW9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        List<Car> carList = Arrays.asList(
                new Car(UUID.randomUUID(), ClassGenerator.randomBrand(), 2021, 10000, 50000),
                new Car(UUID.randomUUID(), ClassGenerator.randomBrand(), 2020, 43000, 20000),
                new Car(UUID.randomUUID(), ClassGenerator.randomBrand(), 2019, 38000, 45000),
                new Car(UUID.randomUUID(), ClassGenerator.randomBrand(), 2009, 74900, 27000),
                new Car(UUID.randomUUID(), ClassGenerator.randomBrand(), 2008, 50500, 39000),
                new Car(UUID.randomUUID(), ClassGenerator.randomBrand(), 2000, 100000, 15000),
                new Car(UUID.randomUUID(), ClassGenerator.randomBrand(), 2008, 50500, 39000),
                new Car(UUID.randomUUID(), ClassGenerator.randomBrand(), 2000, 100000, 15000),
                new Car(UUID.randomUUID(), ClassGenerator.randomBrand(), 2010, 24000, 30000)
        );

        /* Creating random car using ClassGenerator
         *
         */
        Car randomCar = new Car(UUID.randomUUID(), ClassGenerator.randomBrand(),
                ClassGenerator.randomYear(), ClassGenerator.randomMil(), ClassGenerator.randomPrice());
        System.out.println("car1 " + randomCar);
    }
}
