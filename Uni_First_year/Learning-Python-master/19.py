#------------高级函数---------------


#   abs()
#   求绝对值的函数


# a=abs(-10)
# print(a)


#   round()
#   求四舍五入的函数


# b=round(1.98)
# print(b)
#
#
#
# def sum(a, b):
#     return abs(a) + abs(b)
#
# result=sum(-77, 7)
# print(result)





#   map()

# list1=[1, 2, 3, 4]
#
# def func(x):
#     return x ** 2
#
# result= map(func, list1)
# print(result)
# print(list(result))
#



a=[1, 2]

b=a.append(3)
print(a)





#   reduce()
#   必须导入functools函数块
#   累加计算


b=[1, 2, 3, 4, 5]

import functools

def sum(a, b):
    return a + b

c=functools.reduce(sum, b)
print(c)




#   filter（）
#   过滤序列，过滤掉不合符合条件的元素


listA=[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

def bb(x):
    return x % 2 == 0

result=filter(bb, listA)
print(list(result))











