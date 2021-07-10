#       多态
#需求：    警务人员和警犬一起工作，警犬分2种：  追击敌人和追查毒品，携带不同的警犬，执行不同的工作


# #1.定义父类，提供公共方法： 警犬和人
# class Dog(object):
#     def work(self):
#         pass
#
#
# #2.定义子类，子类重写父类方法： 定义2个类表示不同的警犬
# class armydog(Dog):
#     def work(self):
#         print("追击敌人")
#
# class drugdog(Dog):
#     def work(self):
#         print("追查毒品")
#
# class person(object):
#     def work_with_dog(self, dog):
#         dog.work()
#
#
#
# #3.创建对象，调用不同的功能，传入不同的对象，观察执行的结果
#
# ad=armydog()
# dd=drugdog()
# A=person()
# A.work_with_dog(ad)