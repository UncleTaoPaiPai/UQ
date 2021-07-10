#-----------推导式-------------

#   作用： 更有风格的python代码的写法
#   比如python代码要五行写完，但是在推导式里面可能只要一行


#创建一个0-10的列表

# while函数
list1=[]
a=0
while a < 10:
    list1.append(a)
    a += 1
print(list1)


# for 函数
List2=[]
for i in range(10):
    List2.extend([i])
print(List2)

#   for 函数(列表推导式)

list3=[i for i in range(10)]# 第一个“i”是返回值
print(list3)


#创建一个0-10的偶数列表
list5=[]
for i in range(10):
    if i % 2 == 0:
        list5.extend([i])
print(list5)

#创建一个0-10的偶数列表(列表推导式)
list4=[i for i in range(10) if i % 2 == 0 ]
print(list4)


# 创建[(1, 0), (2, 0), (1, 1), (1, 2), (2, 1), (2, 2)]
list6=[(X, Y) for X in range(1, 3) for Y in range (3)]
print(list6)












