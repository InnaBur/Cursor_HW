package com.cursor.HW9;

import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

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
        System.out.println("Random car is: " + randomCar);

        // print all cars brands
        List<Car.Brand> allBrands = carList.stream()
                .map(Car::getBrand).toList();
        System.out.println("Cars brands: " + allBrands);

        // only Tesla and Audi is chosen
         List<Car> onlyTeslaAudi = carList.stream()
               .filter(car -> car.getBrand().equals(Car.Brand.TESLA) || car.getBrand().equals(Car.Brand.AUDI))
                 .collect(Collectors.toList());
        System.out.println("List of AUDI and TESLA: " + onlyTeslaAudi);


        // cars younger 2018: list and brands
        List<Car> carsYear = carList.stream()
                .filter(car -> car.getYear() < 2018).toList();
        System.out.println("List of Cars younger 2018: " + carsYear);

        List<Car.Brand> carsYearName =
                carList.stream()
                        .filter(car -> car.getYear() < 2018)
                        .map(Car::getBrand).toList();
        System.out.println("List of Cars brands younger 2018: " + carsYearName);

        // cars with miles less 40000
        List<Car> carsMiles = carList.stream()
                .filter(car -> car.getMileage() < 40000).toList();
        System.out.println("Cars with mileage less than 40000 miles: " + carsMiles);

        List<Car.Brand> carsMilesBrands = carsMiles.stream()
                .map(car -> car.getBrand()).toList();
        System.out.println("Cars brands with mileage less than 40000 miles: " + carsMilesBrands);

        // sorted by price in descending order
        List<Car.Brand> carsByPriceDesc = carList.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .map(Car::getBrand).toList();
        System.out.println("Cars brands sorted by price in descending order: " + carsByPriceDesc);

       //
        List<Car> cars = carList.stream()
                .sorted(Comparator.comparing(Car::getPrice))
                .limit(3).toList();
        System.out.println("Cars: " + cars);


        Map<UUID, Car> carsMap = cars.stream()
                .collect(Collectors.toMap(Car::getId, car -> car));

        System.out.println("Map is: " + carsMap);
    }

}
