#           烤地瓜


#需求：
#1.   被烤的时间和对应的地瓜状态:
#        0-3分钟： 生的
#        3-5分钟： 半生不熟
#        5-8分钟： 熟的
#        超过8分钟： 烤糊了
#2.   添加自己的调料


class ground_melo():

    #定义地瓜的初始化属性
    def __init__(self):
        #时间
        self.cook_time=0
        #状态
        self.cook_status="生的"
        #调料
        self.cook_condiments=[]

    def cook(self, time):
        self.cook_time += time
        if self.cook_time < 3:
            self.cook_status = "生的"
        elif 3 < self.cook_time < 5:
            self.cook_status = "半生不熟"
        elif 5 < self.cook_time < 8:
            self.cook_status = "熟的"
        elif self.cook_time > 8:
            self.cook_status = "糊了"

    def condiments(self, condiment):
        self.cook_condiments.append(condiment)


    def __str__(self):#str，用于输出对象状态
        return f'该地瓜已经烤了{self.cook_time}分钟，状态为{self.cook_status}， 调料有{self.cook_condiments}'
sweet_potato=ground_melo()

sweet_potato.cook(1)
print(sweet_potato)
sweet_potato.condiments("honey")
sweet_potato.cook(10)
print(sweet_potato)

print(sweet_potato)



