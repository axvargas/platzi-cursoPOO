/*
 * Created Date: Thursday July 29th 2021 7:31:33 pm
 * Author: Andrés X. Vargas
 * -----
 * Last Modified: Friday July 30th 2021 4:33:04 pm
 * Modified By: the developer known as Andrés X. Vargas at <axvargas@fiec.espol.edu.ec>
 * -----
 * Copyright (c) 2021 MattuApps
 */
class Car {
    Integer id;
    String license;
    Account driver;
    Integer passengers;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }    

    public void printDataCar() {
        System.out.println("License: " + license);
        System.out.println("Driver: " + driver.name);
        System.out.println("");
    }
}
