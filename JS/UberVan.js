/*
 * Created Date: Friday July 30th 2021 11:52:47 pm
 * Author: Andrés X. Vargas
 * -----
 * Last Modified: Friday July 30th 2021 11:52:52 pm
 * Modified By: the developer known as Andrés X. Vargas at <axvargas@fiec.espol.edu.ec>
 * -----
 * Copyright (c) 2021 MattuApps
 */
class UberVan extends Car{
    constructor(license, driver, typeCarAccepted, seatsMaterial) {
        super(license, driver)
        this.typeCarAccepted = typeCarAccepted
        this.seatsMaterial = seatsMaterial
    }
}