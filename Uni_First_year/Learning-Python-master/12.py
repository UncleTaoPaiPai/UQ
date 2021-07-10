#   字典的推导式





dict1={x:x**2 for x in range(1, 5)}
print(dict1)



#   将两个列表合并成一个字典

listA=["name", "age", "gender"]
listB=["T", "23", "male"]
dict2={listA[i]: listB[i] for i in range(len(listA))}
print(dict2)


#   提取字典中大于200的字典数据

dict_PC={"DELL":100, "MBP":210, "LG":300, "LC":400}
dict1={key: value for key, value in dict_PC.items() if value >200 }
print(dict1)



#   集合推导式

list1=[1, 2, 3]
set1=set(i ** 2  for i in list1)
print(set1)