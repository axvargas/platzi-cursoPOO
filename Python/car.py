'''
Created Date: Thursday July 29th 2021 7:39:05 pm
Author: Andrés X. Vargas
-----
Last Modified: Friday July 30th 2021 5:20:45 pm
Modified By: the developer known as Andrés X. Vargas at <axvargas@fiec.espol.edu.ec>
-----
Copyright (c) 2021 MattuApps
'''


from account import Account


class Car:
    id = int
    license = str
    driver = Account
    passengers = int

    def __init__(self, license, driver):
      self.name = license
      self.driver = driver