#   搬家

class funiture():
    def __init__(self, name, area):
        self.name=name
        self.area=area


class home():
    def __init__(self, address, area):
        self.address=address
        self.area=area
        self.free_area=area
        self.funiture=[]

    def __str__(self):
        return f'房子的地理位置{self.address},面积是{self.area},剩余面积{self.free_area},家具有{self.funiture}'

    def add_funiture(self, xx):
        if xx.area <= self.free_area:
            self.funiture.append(xx.name)
            self.free_area = self.free_area-xx.area
        else:
            print("没地方放了")

sofa=funiture("沙发", 10)
print(funiture.name)
# B=home("北京", 1000)
# B.add_funiture(sofa)
# print(B)