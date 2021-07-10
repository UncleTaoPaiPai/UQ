#---------公共操作---------


#-----------+(合并)-------

#字符
a="啦啦"
b="发发"
R=1
F=1.2

#列表
c=[1, 2, 3]
d=[4, 5, 6]

#元组
e=(1, 2)
f=(3, 4)

#字典
g={"name":1, "age":12}
h={"gender": "male", "height": 1.22}

print(a + b ) #--- +(合并) 支持字符
print(c + d) #--- +(合并) 支持列表
print(e + f) #--- +(合并) 支持元组
# 不支持整形 和浮点数 还有字典




#---------*(复制)---------

print(a * 2)    #--- *(复制) 支持字符
print(c * 2)    #--- *(复制) 支持列表
print(f * 3)    #--- *(复制) 支持元组



#-----------------判断是否存在-------------------

#---   in(存在) -----
#---   not in(不存在) -----


print("啦" in a)
print(1 in c)
print(100 in e)
print("height" not in h)



#------len()----------
#  统计容器中元素的个数
print(len(a))
print(len(h))
print(len(c))


#-----del()--------
#   删除
del c[1]
print(c)
#del e[1]
#print(e)
# del() 这个函数不能删除元组,还有字符里面的特定字符，如A(1,2,4)不能直接删除2，但是能删除一整个元组，就是A(1,2,4)
# del() 可以在字典 列表里面删除特定的字符， 如S[1, 2, 3]他可以删除这里面的1，也可以删除一整个列表
#                  s={"name":"HH", "gender":"male"}他可以删除里面特定的“name”还有他所对应的值，也可以删除一整个字典



#------max()-----

#  求最大值 支持列表 字典

#-----min()-----

#  求最小值  支持列表字典



#--------range()-------
#----生成序列---只能在for 函数里面使用

#  range(start, end, step)
# 不包含end
for i in range(10):
    print(i)

for v in range(1, 10):#返回后  不包含10
    print(v)

for k in range(1, 20, 5):
    print(k)






#-----------Enumerate()----------
#   返回的结果是元组
#   元组的第一个数据是对应的下标数字

for i in enumerate(d, start=1):
    print(i)
#支持元组，列表，字典




#------数据(容器)类型转换------
X1=[1, 2, 3, 4]
X2=("D", "DSF", "S", 1)
X3={"name":"sdf", "age": 12, "gender":"male"}

# tuple():转换成元组
print(tuple(X1))

# list(): 转换成列表
print(list(X2))

# set(): 转换成集合
print(set(X1))














