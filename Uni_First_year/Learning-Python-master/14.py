#-------------------------- 函数--------——————————————————-------
#
#
#函数的作用： 封装代码， 高效的代码重用
#
#
#
#
# def 函数名（参数）：
#     代码1
#     代码2
#     。。。


# def A():
#     print("显示余额")
#     print("存款")
#     print("取款")
#
#
# print("恭喜您登入成功")
# A()
# print("你的余额是1000000000000000000000000000")
# A()
# print("去了300元")
# A()
#
#
#
# def B():
#     print("Hello World")
#
# B()
#
#
# def add_num(A, B):
#     result=A+B
#     print(result)
# add_num(1, 3)
# add_num(100, 200)
#
#
#
# def c():
#     return "酒"#return 下方的代码 不执行
#
#
# good=c()
# print(good)
#
#
#
# def d(a, b):
#     return a+b
# bd=d(3, 5)
# print(bd)

#------------函数说明文档-----------


#---------help(len())

#          help函数作用： 查看函数的说明文档（函数的解释说明的信息）
#
# def xxx(a, b):
#     """求和函数"""
#     return a + b
#
# help(xxx)
#
#
#
# def xxx1(a, b):
#     """
#     求和函数
#     :param a:参数一
#     :param b: 参数二
#     :return: 返回值
#     """
#     return a + b
#
# help(xxx1)







#-----------两个函数  testA 和 testB -- 在A里面嵌套调用B



# # B函数
# def testB():
#     print("从B函数开始------")
#     print("这是B函数")
#     print("从B函数结束------")
#
#
#
# # A函数
# def testA ():
#     print("从A函数开始-----")
#     testB()
#     print("从A函数结束-----")
#
#
#
# testA()
#













#------------打印图形--------------






def print_line():
    print("-"*20)





#--------------------------------------------
#--------------函数嵌套-----------------



# def print_line():
#     print("-"*20)
#
#
# def type_line(num):
#     i=0
#     while i < num:
#         print_line()
#         i += 1
#
# type_line(5)




#---------------求三个数平均值-----------


#--求和
def three_sum(a, b, c):

    return a+b+c

# H=three_sum(1, 2, 2)
#
# print(H)

#--平均值
def three_average(a, b, c):

    result=three_sum(a, b, c)/3
    return result

jjj=three_average(2, 3, 4)
print(jjj)



















