#-----------------------继承---------------------------
#   生活中，子女继承父辈的财产-------生活中继承

# 语法：
#       class 类名(object):
#           代码

# # 父类A
# class A(object):#  父类(object类)也叫顶级类或者基类
#     def __init__(self):
#         self.num = 1
#
#     def info_print(self):
#         print(self.num)
#
# # 子类B
# class B(A): # class(B)继承class(A)
#             # 其他子类也叫 派生类
#     pass
#
# test=B()
# test.info_print()




#-------------单继承---------------------
# 1. 师傅类，属性和方法：
# class Master(object):
#
#     def __init__(self):
#         self.kongfu="ddd"
#
#     def make_cake(self):
#         print(f'aaaa{self.kongfu}')
#
# # 2.徒弟类
# class a(Master):
#     pass
#
# bb=a()
# print(bb.kongfu)
# bb.make_cake()



#-------------多继承-------------------
#   所谓多继承就是： 一个子类同时继承多个父类
# class Master(object):
#
#     def __init__(self):
#         self.kongfu="ddd"
#
#     def make_cake(self):
#         print(f'aaaa{self.kongfu}')
#
#
# # 为了验证多继承，添加school父类
# class School(object):
#
#     def __init__(self):
#         self.kongfu="ccc"
#
#     def make_cake(self):
#         print(f'ffff{self.kongfu}')
#
# # 2.徒弟类
# class a(Master, School):# 当一个类有多个父类的时候，
#                         # 默认使用第一个父类的同名属性和方法
#
#     pass
#
# bb=a()
# print(bb.kongfu)
# bb.make_cake()


#---------------子类重写父类同名属性和方法-----------------


# #   所谓多继承就是： 一个子类同时继承多个父类
# class Master(object):
#
#     def __init__(self):
#         self.kongfu="古法饼"
#
#     def make_cake(self):
#         print(f'我会{self.kongfu}')
#
#
# # 为了验证多继承，添加school父类
# class School(object):
#
#     def __init__(self):
#         self.kongfu="学院派饼"
#
#     def make_cake(self):
#         print(f'我会{self.kongfu}')
#
# # 2.徒弟类
# class a(Master, School):# 当子类同时拥有父类，还有本身的属性时
#                         # print出来的是子类自身的属性
#
#     def __init__(self):
#         self.kongfu = "独创饼"
#
#     def make_cake(self):
#         #在这里加初始化的原因： 如果不加这个自己的初始化，kongfu属性值是上一次调用的init内的kongfu属性值
#         self.__init__()
#         print(f'我会{self.kongfu}')
#
#     def make_master_cake(self):
#         #再次调用初始化的原因： 这里想要调用父类的同名方法和属性，
#                             # 属性在init初始化位置，所以需要再次调用init
#         Master.__init__(self)
#         Master.make_cake(self)
#
#     def make_School_cake(self):
#
#         School.__init__(self)
#         School.make_cake(self)
#
#
# bb=a()
#
# bb.make_cake()
# bb.make_master_cake()
# bb.make_School_cake()
# bb.make_cake()
#print(a.__mro__)#可以打印改子类所继承的父*类




#----------------------多层继承---------------------------

# 父类传子类， 子类传孙类

class Master(object):

    def __init__(self):
        self.kongfu="古法饼"

    def make_cake(self):
        print(f'我会{self.kongfu}')


# 为了验证多继承，添加school父类
class School(object):

    def __init__(self):
        self.kongfu="学院派饼"

    def make_cake(self):
        print(f'我会{self.kongfu}')

# 2.徒弟类
class a(Master, School):# 当子类同时拥有父类，还有本身的属性时
                        # print出来的是子类自身的属性

    def __init__(self):
        self.kongfu = "独创饼"

    def make_cake(self):
        #在这里加初始化的原因： 如果不加这个自己的初始化，kongfu属性值是上一次调用的init内的kongfu属性值
        self.__init__()
        print(f'我会{self.kongfu}')

    def make_master_cake(self):
        #再次调用初始化的原因： 这里想要调用父类的同名方法和属性，
                            # 属性在init初始化位置，所以需要再次调用init
        Master.__init__(self)
        Master.make_cake(self)

    def make_School_cake(self):

        School.__init__(self)
        School.make_cake(self)



# 徒孙类：
#class grandson(a):
#    pass
bb=a()

bb.make_cake()
# bb.make_master_cake()
# bb.make_School_cake()
# bb.make_cake()



























