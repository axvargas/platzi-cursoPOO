
/*
 * Created Date: Friday July 30th 2021 5:54:07 pm
 * Author: Andrés X. Vargas
 * -----
 * Last Modified: Sunday August 1st 2021 10:32:45 am
 * Modified By: the developer known as Andrés X. Vargas at <axvargas@fiec.espol.edu.ec>
 * -----
 * Copyright (c) 2021 MattuApps
 */
import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver, Map<String, Map<String, Integer>> typeCarAccepted,
            ArrayList<String> seatsMaterial) {
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

    public UberVan(String license, Account driver) {
        super(license, driver);
    }

    @Override
    public void setPassengers(Integer passengers) {
        if(passengers == 6){
            this.passengers = passengers;
        }else{
            System.out.println("You must assign 6 passengers");
        }
    }
}
