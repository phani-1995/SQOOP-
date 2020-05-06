import os 
import sys

importcommandsqoop="sqoop import --connect jdbc:mysql://localhost:3306/employee --username hduser --password hduser --table details --m 1 --target-dir /user/local/hadoop/data"

os.system(importcommandsqoop)
