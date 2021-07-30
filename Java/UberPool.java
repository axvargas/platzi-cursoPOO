/*
 * Created Date: Friday July 30th 2021 5:50:08 pm
 * Author: Andrés X. Vargas
 * -----
 * Last Modified: Friday July 30th 2021 5:50:27 pm
 * Modified By: the developer known as Andrés X. Vargas at <axvargas@fiec.espol.edu.ec>
 * -----
 * Copyright (c) 2021 MattuApps
 */
class UberPool extends Car {
    String brand;
    String model;

    public UberPool(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
}
