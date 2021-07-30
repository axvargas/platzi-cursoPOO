/*
 * Created Date: Thursday July 29th 2021 7:30:19 pm
 * Author: Andrés X. Vargas
 * -----
 * Last Modified: Friday July 30th 2021 4:30:15 pm
 * Modified By: the developer known as Andrés X. Vargas at <axvargas@fiec.espol.edu.ec>
 * -----
 * Copyright (c) 2021 MattuApps
 */
class Account {
    Integer id;
    String name;
    String document;
    String email;
    String password;

    public Account(String name, String document) {
        this.name = name;
        this.document = document;
    }
}
