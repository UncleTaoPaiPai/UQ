#-------------字典-------------
#符号： dict1={'','',''}
# {}里面放键值对，各个键值对用逗号"，"隔开

dictA={"name":"Tony", "age":20, "gender":"male"}
#-----键就是"name","age",还有"gender"---------
#-----值就是"Tony"，20,"male"--------

dict1={} #空字典

dict2=dict()
print(type(dict2))


#----增/修改----
dict3={"name":"hhh", "yy":"ds"}
dict3["sss"] ="sddds"
print(dict3)
#dict3["sss"] ="sddds" 如果dict3本身有的就是修改值，如果没有就是增加值。



#------删-------
# del()
# 变量.clear()


dict4={"name":"qq", "age":22}
#del (dict4)
#print(dict4)
del dict4["age"]
print(dict4)
dict4.clear()
print(dict4)


#-------查找---------
dict5={"hhh":1, "SSS":"S", "TR":"WEW33"}
print(dict5["hhh"])
print(dict5.get("TR"))
print(dict5.get("hgg"))
print(dict5.get("tgg", "hu"))

#----变量.keys()-----
print(dict5.keys())
#返回的是键

#----变量.value()----
print(dict5.values())
#返回的是键所对应的值

#---变量.item()-----
print(dict5.items())
#---返回的数据是每个元组---





#-------------循环(遍历)字典-----------
for i in dict5.keys():
    print(i)
#返回的是键

for i in dict5.values():
    print(i)
#返回的是键所对应的值

for i in dict5.items():
    print(i)
#返回的是键和所对应的值（元组）


for key, value in dict5.items():
    print(f'{key}={value}')




















