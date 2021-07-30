/*
 * Created Date: Thursday July 29th 2021 7:23:38 pm
 * Author: Andrés X. Vargas
 * -----
 * Last Modified: Friday July 30th 2021 4:32:02 pm
 * Modified By: the developer known as Andrés X. Vargas at <axvargas@fiec.espol.edu.ec>
 * -----
 * Copyright (c) 2021 MattuApps
 */

class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!"); 
        Car car = new Car("GMT-7896", new Account("Anahí Salgado", "0944441768"));
        car.passengers = 4;
        System.out.println("Car license: " + car.license + "\n");

        Car car2 = new Car("GMT-8888", new Account("Ale Cruz", "0931478528"));
        car2.passengers = 4;
        car2.printDataCar();
    }
}