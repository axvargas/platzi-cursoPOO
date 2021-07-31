'''
Created Date: Friday July 30th 2021 11:27:32 pm
Author: Andrés X. Vargas
-----
Last Modified: Friday July 30th 2021 11:27:39 pm
Modified By: the developer known as Andrés X. Vargas at <axvargas@fiec.espol.edu.ec>
-----
Copyright (c) 2021 MattuApps
'''
from car import Car

class UberPool(Car):
    brand = str
    model = str

    def __init__(self, license, driver, brand, model):
        super().__init__(license, driver)
        self.brand = brand
        self.model = model