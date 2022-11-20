package com.cursor.HW9;

import java.util.Random;

/** In the class brand, year, price and miles are generated randomly
 *
 */
public class ClassGenerator {

    public static Car.Brand randomBrand() {
        Car.Brand[] brand = Car.Brand.values();
        int randomIndex = new Random().nextInt(brand.length);
        return brand[randomIndex];
    }
    public static int randomYear() {
        return new Random().nextInt(2000, 2022);
    }

    public static int randomMil() {
        return new Random().nextInt(1000, 100000);
    }

    public static int randomPrice() {
        return new Random().nextInt(10000, 75000);
    }
}
