/*
 * Created Date: Thursday July 29th 2021 7:23:38 pm
 * Author: Andrés X. Vargas
 * -----
 * Last Modified: Saturday July 31st 2021 10:50:30 pm
 * Modified By: the developer known as Andrés X. Vargas at <axvargas@fiec.espol.edu.ec>
 * -----
 * Copyright (c) 2021 MattuApps
 */

class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!"); 
        Car car = new Car("GMT-7896", new Account("Anahí Salgado", "0944441768"));
        // car.passengers = 4;
        System.out.println("Car license: " + car.license + "\n");

        UberX uberX = new UberX("GMT-8888", new Account("Ale Cruz", "0931478528"), "Chevrolet", "Spark GT");
        uberX.setPassengers(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("QTY-8952", new Account("Rafael Rojas", "0987485214"));
        uberVan.setPassengers(6);
        uberVan.printDataCar();
    }
}