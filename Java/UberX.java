/*
 * Created Date: Friday July 30th 2021 5:46:15 pm
 * Author: Andrés X. Vargas
 * -----
 * Last Modified: Friday July 30th 2021 5:49:44 pm
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
}
