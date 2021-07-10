#----------------for 循环-------------
# for  临时变量 in 序列：
#    重复执行的代码1
#    重复执行的代码2
#    ......

a= "sjkfsjdf"
for i in a:
    print(i)


#当b遇到r时，停止打印
b = "qwertyui"
for i in b:
    if b == "r":
        break
    print(i)

#当c遇到g时，不打印g。
c="asdfghjkl"
for i in c:
    if i == "g":
        print("不打印g")
        continue
    print(i)



#--------------while...else...----------
#需求： 女朋友生气了，要惩罚：说五遍我错了。然后说完 女朋友就原谅我了，这个程序怎么写？
#while  条件：
#   条件成立重复执行的代码
#else：
#   条件成立重复执行的代码


i= 1
while i <=5:
    print("老婆！我错了！！")
    i += 1
else:
    print("原谅你了！！")


#道歉到了第三遍的时候，媳妇说不真诚，叫我滚！
E= 1
while E <=5:
    if E == 3:
        print("不真诚啊！！滚吧！")
        break
    print("老婆！我错了！！")
    E += 1
else:
    print("原谅你了！！")#在带有break的时候  else这一块将不执行！！



#道歉到了第三遍的时候，被媳妇儿发现 不真诚，媳妇儿很大度，不计较。然后继续道歉！！1
R= 1
while R <=5:

    if R == 3:
        print("你这一遍，不真诚啊！算了，下一遍吧！")
        R += 1
        continue
    print("老婆！我错了！！")
    R += 1
else:
    print("原谅你了！！")



#---------for...else...---------
#
#
#for 临时变量 in 序列：
#   重复执行的代码
#   ......
#else:
#   循环正常结束之后要执行的代码

T="我爱老婆！我爱中国！"
for i in T:
    print(i)
else:
    print("我说完了！！！")


#-------------for...else...---break---

T1="奥累给！老铁们！"
for i in T1:
    if i == "老":
        print("MDZZ")
        break
    print(i)
else:
    print("我说完了！！！")#else不执行


#-------------for...else...---continue---
T1="奥累给！老铁们！"
for i in T1:
    if i == "老":
        print("你哄那么大声干什么啊")
        continue
    print(i)
else:
    print("我说完了！！！")#else执行