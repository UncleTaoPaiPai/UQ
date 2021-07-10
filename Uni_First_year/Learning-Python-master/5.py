#----------while循环语句-----------

# 思路： 叫女朋友，喊爸爸100遍
#-----循环语句分为：  while语句  和  for语句-----

#格式：
# i=1
# while条件：
#       条件成立重复执行的代码1
#       条件成立重复执行的代码2
#       ......
#       i += 1

# 需求重复打印100次爸爸


i = 0 #代表循环次数的用 "i"
# 一般情况下第一次"i"为0，因为计算机语言中，第一位是"0".
while i <= 4:
        print("爸爸！！")
        i += 1

print("哈哈哈")



#-----计算1+2+3....+100的累加-----
#
i = 1
result = 0
while i <= 100:
    result = result + i
    i += 1
print(result)


#---计算1~100的偶数累加和---

i = 1
result = 0
while i <= 100:
    if (i % 2) == 0:
        result += i
    i += 1
print(result)

i = 0
result = 0
while i <= 100:
    result += i
    i += 2
print(result)


#------break---and---continue------
#
#   break:
#   你要吃5个苹果， 吃完第一个第二个后饱了，不需要再吃了。就得用 break
#
#   continue：
#   如果你吃到第三个苹果的时候吃出来 一条虫子，那还得继续吃第四个，第五个。就得用continue
#
#
#
#到第四个时候，停下
i = 0
while i <= 5:
    if i == 4:
        break
    i += 1
    print(f'你已经到了{i}了')




#到第四个停下，然后继续下去
i = 0
while i <= 10:
    if i == 3:
        print("哈哈哈哈")
        i += 1
        continue
    print(f'你已经到了{i}哈')
    i += 1




#-----while嵌套语句-----
#   说：老婆!我错了!
#    然后重复三天说这话！！！
j = 0
while j <= 2:
    i = 0
    while i <= 2:
        print("老婆！我错了！！")
        i += 1
    print("刷碗去吧！！")
    j += 1










