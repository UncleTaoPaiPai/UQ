#---------------super()方法作用------------------

#
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
# class School(Master):
#
#     def __init__(self):
#         self.kongfu="学院派饼"
#
#     def make_cake(self):
#         print(f'我会{self.kongfu}')
#
#         # super(School, self).__init__()
#         # super(School, self).make_cake()
#
#         super().__init__()
#         super().make_cake()
#
# # 2.徒弟类
# class a(School):# 当子类同时拥有父类，还有本身的属性时
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
#         School.__init__(self)
#         School.make_cake(self)
#
#
#      #需求： 一次性调用父类School Master的方法
#     def make_old_cake(self):
#         # 方法一： 如果定义的类名修改，这里也要修改，麻烦： 代码量庞大，冗余
#         # Master.__init__(self)
#         # Master.make_cake(self)
#         # School.__init__(self)
#         # School.make_cake(self)
#
#         # 方法二：super()
#         #  super(当前类名， self).函数
#         # super(a, self).__init__()
#         # super(a, self).make_cake()
#
#         # 方法三：无参数super()
#         super().__init__()
#         super().make_cake()
#
#
# bb=a()
# bb.make_old_cake()



#------------------------------私有权限------------------------------------------


#   大师想把技术传承给徒弟的同时，不想把自己的钱（200000个亿）传承给徒弟，这个时候就要为这个钱这个实例属性设置私有权限
#   比如在父类里面放入私有属性，就只能在父类里面调用这个，但是在子类里面就是调用不到（会报错）

class Master(object):

    def __init__(self):
        self.kongfu="古法饼"

    def make_cake(self):
        print(f'我会{self.kongfu}')

class School(Master):

    def __init__(self):
        self.kongfu="学员饼"

    def make_cake(self):
        print(f'我会{self.kongfu}')

class Own(School):

    def __init__(self):
        self.kongfu="自制饼"
        # 定义私有属性
        self.__money=1000000000000  #在前面加两个__就变成了私有属性


    def __info(self):
        # 定义私有函数
        print("ss")


    # 定义私有属性
    def get_money(self):
        return self.__money

     # 修改私有属性
    def set_money(self):
        self.__money=500

    def make_cake(self):
        self.kongfu="自制饼"
        print(f'我会{self.kongfu}')

    def Master_make_cake(self):
        Master.__init__(self)
        Master.make_cake(self)

    def School_make_cake(self):
        School.__init__(self)
        School.make_cake(self)

class son(Own):
    pass

A=son()
#print(A.money)
#A.__info()调用不到
print(A.get_money())# 修改前的
A.set_money()# 讲get_money的数字改了，print出去
print(A.get_money())# 修改后的

























