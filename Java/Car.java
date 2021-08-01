/*
 * Created Date: Thursday July 29th 2021 7:31:33 pm
 * Author: Andrés X. Vargas
 * -----
 * Last Modified: Sunday August 1st 2021 10:32:23 am
 * Modified By: the developer known as Andrés X. Vargas at <axvargas@fiec.espol.edu.ec>
 * -----
 * Copyright (c) 2021 MattuApps
 */
class Car {
    Integer id;
    String license;
    Account driver;
    protected Integer passengers;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    public void printDataCar() {
        System.out.println("License: " + license);
        System.out.println("Driver: " + driver.name);
        System.out.println("Passengers: " + passengers);
        System.out.println("");
    }

    public void setPassengers(Integer passengers) {
        if(passengers == 4){
            this.passengers = passengers;
        }else{
            System.out.println("You must assign 4 passengers");
        }
    }

    public Integer getPassengers() {
        return passengers;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    
}
