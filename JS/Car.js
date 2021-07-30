/*
 * Created Date: Friday July 30th 2021 4:17:10 pm
 * Author: Andrés X. Vargas
 * -----
 * Last Modified: Friday July 30th 2021 5:02:41 pm
 * Modified By: the developer known as Andrés X. Vargas at <axvargas@fiec.espol.edu.ec>
 * -----
 * Copyright (c) 2021 MattuApps
 */
class Car{
    constructor(license, driver) {
        this.id
        this.license = license
        this.driver = driver
        this.passengers
    }

    printDataCar = () =>{
        console.log(this.driver);
        console.log(`License: ${this.license}`)
        console.log(`Driver: ${this.driver.name}`)
        console.log()
    }
}

