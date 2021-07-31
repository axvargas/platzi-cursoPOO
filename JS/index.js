/*
 * Created Date: Friday July 30th 2021 4:16:08 pm
 * Author: Andrés X. Vargas
 * -----
 * Last Modified: Friday July 30th 2021 11:55:14 pm
 * Modified By: the developer known as Andrés X. Vargas at <axvargas@fiec.espol.edu.ec>
 * -----
 * Copyright (c) 2021 MattuApps
 */

let car = new Car("GYE-8748", new Account("Ernesto Vargas", "09874857586"))
car.passenger = 4
car.printDataCar()

let uberx = new UberX("GYE-8228", new Account("Pao Sanchez", "09852857574"), "Chevrolet", "Spark GT")
uberx.passenger = 4
uberx.printDataCar()
