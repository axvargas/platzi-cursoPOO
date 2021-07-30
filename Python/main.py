'''
Created Date: Thursday July 29th 2021 7:34:51 pm
Author: Andrés X. Vargas
-----
Last Modified: Friday July 30th 2021 5:21:07 pm
Modified By: the developer known as Andrés X. Vargas at <axvargas@fiec.espol.edu.ec>
-----
Copyright (c) 2021 MattuApps
'''


from account import Account
from car import Car

def main():
    print('Hello world!')
    car = Car("GMT-7845", Account("Xavier Vargas", "0931341762"))
    print(vars(car))
    print(vars(car.driver))

if __name__ == '__main__':
    main()
