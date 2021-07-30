'''
Created Date: Thursday July 29th 2021 7:37:16 pm
Author: Andrés X. Vargas
-----
Last Modified: Friday July 30th 2021 5:18:27 pm
Modified By: the developer known as Andrés X. Vargas at <axvargas@fiec.espol.edu.ec>
-----
Copyright (c) 2021 MattuApps
'''


class Account:
    id = int
    name = str
    document = str
    email = str
    password = str

    def __init__(self, name, document):
      self.name = name
      self.document = document
