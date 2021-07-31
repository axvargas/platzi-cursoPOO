/*
 * Created Date: Friday July 30th 2021 11:48:59 pm
 * Author: Andrés X. Vargas
 * -----
 * Last Modified: Friday July 30th 2021 11:49:21 pm
 * Modified By: the developer known as Andrés X. Vargas at <axvargas@fiec.espol.edu.ec>
 * -----
 * Copyright (c) 2021 MattuApps
 */
class UberPool extends Car{
    constructor(license, driver, brand, model) {
        super(license, driver)
        this.brand = brand
        this.model = model
    }
}