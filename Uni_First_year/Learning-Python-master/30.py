#       类方法
#   必须要有私有类属性
#   想使用私有属性就得使用----类方法

# class Dog(object):
#     __tooth=100
#
#     @classmethod#类方法
#     def get_tooth(cls):
#
#         return cls.__tooth
# Xiaohei=Dog()
# A=Xiaohei.get_tooth()
# print(A)



#       静态方法

#1. 定义类： 定义静态方法
class Dog(object):
    @staticmethod
    def info_print():
        print("这是一个静态方法")


#2. 创建对象
Wangcai=Dog()

#3.调用静态方法： 类和对象
Wangcai.info_print()
Dog.info_print()





