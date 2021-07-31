/*
 * Created Date: Friday July 30th 2021 11:49:13 pm
 * Author: Andrés X. Vargas
 * -----
 * Last Modified: Friday July 30th 2021 11:52:38 pm
 * Modified By: the developer known as Andrés X. Vargas at <axvargas@fiec.espol.edu.ec>
 * -----
 * Copyright (c) 2021 MattuApps
 */
class UberBlack extends Car{
    constructor(license, driver, typeCarAccepted, seatsMaterial) {
        super(license, driver)
        this.typeCarAccepted = typeCarAccepted
        this.seatsMaterial = seatsMaterial
    }
}