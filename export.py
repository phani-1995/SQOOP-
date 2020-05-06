import os
import sys

exportcommandsqoop="sqoop export -m1 --connect jdbc:mysql://localhost:3306/employee --username hduser --password hduser --table details1 --export-dir /user/local/hadoop/data/part-m-00000"

os.system(exportcommandsqoop)
