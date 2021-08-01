/*
 * Created Date: Friday July 30th 2021 5:46:15 pm
 * Author: Andrés X. Vargas
 * -----
 * Last Modified: Sunday August 1st 2021 10:32:28 am
 * Modified By: the developer known as Andrés X. Vargas at <axvargas@fiec.espol.edu.ec>
 * -----
 * Copyright (c) 2021 MattuApps
 */
class UberX extends Car {
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }

    public void printDataCar() {
        System.out.println("License: " + license);
        System.out.println("Driver: " + driver.name);
        System.out.println("Passengers: " + passengers);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("");
    }
}
