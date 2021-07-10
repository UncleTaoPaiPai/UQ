# a= 100
#
# print(a)
#
# def testA():
#     print(a)    #局部变量
#
# def testB():
#
#     global a    #全局变量
#     a=200
#     print(a)
#
# testA()
# testB()
# print(a)
#
#
#
# def user_name(name, age, gender):
#     print(f'你的名字是{name},年龄是{age}，性别是{gender}')
#
# user_name("hh", "女", gender="男")
# #
# #
#
# #-------------不定长参数---------
#
# #包裹位置传递
# def aa(*args):
#     print(args)
#
# aa("fsklfsl", 2)
# print(aa)
# #




#-----------------拆包-----------------
#   拆字典，元组




# #--元组--
# def mmm(A, B):
#     return A, B
#
# a=mmm(100, 200)
# num1, num2=a
# print(num1)
# print(num2)
#
#
# #--字典--
#
#
# dict={"name":"TOM", "AGE": 23}
# A, B=dict
#
# #key
# print(A)
# print(B)
#
# #value
# print(dict[A])
# print(dict[B])


#-------------------交换变量-------------

#--方法一：
# a=10, b=20 交换他们的值
# a=10
# b=20
# c=0
# c=a
# a=b
# b=c
# print(a)
# print(b)
#
#
# #--方法二
#
# a1, b1 = 1, 2
# print(a1)
# print(b1)
#
# a1, b1 = b1, a1
#
# print(a1)
# print(b1)


#------------------引用-------------

#   id()  来判断两个变量是否为同一个值的引用

#---------可变与不可变类型--------

#--可变类型：
#   列表
#   字典
#   集合



#--不可变类型：
#   整型
#   浮点型
#   字符串
#   元组













# name = "itcast"
# def demo1():
#     name_tab = "姓名： %s" % name
#     name = "None"
#     return name_tab
#
#
# def demo2():
#     return demo1(), "python"
#
#
# des = demo2()
# print(des)


def print_info(gender=True, name):
    print(gender, name)


print_info("tom", gender = False)












