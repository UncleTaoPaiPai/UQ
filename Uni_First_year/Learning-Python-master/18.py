#       lambda函数        #

# 特点：
#       函数自己调用自己，函数中需要有结束条件，否则会出现错误

#作用： 化简代码

#如果一个函数而且这个函数只有一个返回值，并且只有一句代码，可以使用lambda简化


#   lambda 参数列表 ： 表达式


# def fn1():
#     return 100
# result=fn1()
# print(result)


#用lambda函数完成：

# lambda 参数列表： 表达式

# fn1 = lambda: 100
# print(fn1) # 这个打印出来的是 lambda的内存地址
#
#
# print(fn1()) # 这个打印出来的是lambda的值



# def add_num(a, b):
#     return  a + b
#
# result = add_num(2, 3)
# print(result)
#
#
#
# a = lambda a, b : a + b
# print(a(3, 3))





#1. 无参数

# a = lambda : 100
# print(a())
#
#
#
# #2. 一个参数
# b = lambda a : a
# print(b("  "))# 输入你要打印的字符
#
#
#
# #3. 默认参数
# c = lambda a, b, c:a + b + c
# print(c(2,3,4))
#
#
#
# #4. 可变参数  *args
# d= lambda *args: args
# print(d(10, 20))#返回出来的是元组
#
#
#
# #5. 可变参数 **kwargs
# e= lambda **kwargs : kwargs
# print(e(name= "dd", age=23)) #返回出来的是字典


#-----------带判断的lambda---------------
#
# A=lambda a, b : a if a > b else b
# print(A(100, 2))





#-----------列表数据按字典key的值排序------------



a=lambda *args: sum(args)
print(a(1, 2))




b=lambda: None
print(b())


