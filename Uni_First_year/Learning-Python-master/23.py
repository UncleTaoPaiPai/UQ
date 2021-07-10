# 需求： 洗衣机
# 功能： 能洗衣服

# # 1.定义洗衣机类
# """
# class 类名():
#     代码
# """
# #   class就是一个洗衣机的图纸
#
# class washing_machine():
#
#     def wash(self):#self指的是该函数的对象
#         print("这是洗衣服的功能！")
#         print(self)
#
#
#
# # 2.创建对象
# #对象名 = 类名()
#
# #wahaha就是这个洗衣机的品牌名字
# #将这个洗衣机的图纸加入到这个品牌名字
# Wahaha = washing_machine()
#
#
# # 3.验证成果
# # 打印这个洗衣机品牌
#
# print(Wahaha)
#
# # 使用洗衣机的wash功能 --
# # 实例方法/对象方法 --
# # 对象名.函数名()
# Wahaha.wash()#启动洗衣机洗衣服功能


###################################################
#           如何添加和获取对象属性
#   属性就是特征：洗衣机的高度，宽度，重量

#   类外面添加对象属性
#   语法：
#       对象名.属性名 = 值

#   类外面获取对象属性
#   语法：
#   对象名.属性名

# class Washer():
#     def wash(self):
#         print("可以洗衣服！")
#         print(self)
#
# Wahaha = Washer()
# Wahaha.wash()
#
# # 添加属性  对象名.属性名 = 值
# Wahaha.width = 400
# Wahaha.height = 500
#
# # 获取属性 对象名.属性名
# print(f'洗衣机的宽度{Wahaha.width}')
# print(f'洗衣机的高度{Wahaha.height}')


#   类里面获取对象属性
#   语法：
#       self.属性名
# class Washer():
#     def wash(self):
#         print("可以洗衣服！")
#
#     def wash_info(self):
#         #类里面获取对象属性
#         #self.属性名
#         #print(self.属性名)
#         print(f'洗衣机的宽度{self.width}')
#         print(f'洗衣机的高度{self.height}')
#
#
# Wahaha = Washer()
#
#
# # 添加对象/实例属性
# Wahaha.width = 400
# Wahaha.height = 500
#
# Wahaha.wash_info()

#######################################

#           魔法方法

#   __xx__()
#   类似此类的都叫魔法方法

#   __init__()
#   洗衣机的属性，宽度高度长度，都是在创建对象之前才有的属性
#   因为这些属性是在类里面（图纸嘛）在图纸里面设置好属性

# class Washer():
#
#     # 定义__init__，添加实例属性
#     def __init__(self):
#         # 添加实例属性
#         self.width=100
#         self.height=200
#
#     def wash(self):
#         print("可以洗衣服！")
#         print(self)
#
#     def print_info(self):
#         print(f'洗衣机的宽度{self.width}')
#         print(f'洗衣机的高度{self.height}')
#
# Wahaha=Washer()
# Wahaha.print_info()




#          带参数的__init__()
# class Washer():
#     def __init__(self, width, height):
#         self.width=width
#         self.height=height
#
#     def print_info(self):
#         print(f'洗衣机的宽度{self.width}')
#         print(f'洗衣机的高度{self.height}')
#
# Haier=Washer(100, 200)
# Haier.print_info()
#
# Haier1=Washer(200, 500)
# Haier1.print_info()

#   __str__
#   str放的是一些解释性文字
#   当我们print(对象名)的时候，出来的是： 内存地址

#   没有str的情况下：
# class Washer():
#     def __init__(self):
#         self.width=300
#         self.height=500
#
# Haier=Washer()
# print(Haier)



#   有str的情况下：
# class Washer():
#     def __init__(self):
#         self.width=300
#         self.height=500
#
#     def __str__(self): #放的是一些解释性文字
#         return "这是洗衣机的说明书！"
# Haier=Washer()
# print(Haier)


#   __del__()
#   当删除对象时，python解释器 就会调用__del__()方法
class Washer():
    def __init__(self):
        self.width = 300
        self.height = 500

    def __del__(self):  # 放的是一些解释性文字
        print("这是洗衣机的说明书！")


Haier = Washer()
print(Haier.width)







