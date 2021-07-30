<!-- 
 * Created Date: Friday July 30th 2021 5:59:20 pm
 * Author: Andrés X. Vargas
 * -----
 * Last Modified: Friday July 30th 2021 5:59:21 pm
 * Modified By: the developer known as Andrés X. Vargas at <axvargas@fiec.espol.edu.ec>
 * -----
 * Copyright (c) 2021 MattuApps 
-->

<?php
require_once('account.php');
class Car {
    public $id;
    public $license;
    public $driver;
    public $passengers;

    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver = $driver;
    }

    public function printDataCar(){
        echo "License: $this->license <br/>";
        echo "Driver: ".$this->driver->name ."<br/>";
        echo "<br/>";
    }
}

?>