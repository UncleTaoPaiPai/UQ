#-------------------字符串--------------

#字符串分为 '  ''  '''
#  单引号，双引号, 三引号


A = 'Hello ' \
    'World'
print(type(A))
print(A)


B = "Hello " \
    "World"
print(type(B))
print(B)

C = '''Hello    
World''' #三引号的字符串可以换行打印
print(type(C))
print(C)

D = 'I\'m Tony'
print(D) # 在单引号当中，若要打印’ 就得在前面使用\

E = "I'm Tony"
print(E)

F = '''I'm Tony'''
print(F)


#---------下标(索引)-----------
#---字符从0开始顺序分配一个编号，使用这个编号准确找到某个字符数据
G = "YONGZHI"
print(G[2])
print(G[3])
print(G[1])







#------------切片-------------

#序列[开始位置下标：结束位置下标：步长]

H="123456789"
print(H[2:5:1]) #[2:5]：包含2，不包含5
print(H[0:6:2])
print(H[2:]) #第三位往后的数字
print(H[:5]) #从第零位开始选，一直到4
print(H[:]) #选取所有
print(H[: :-1]) #倒叙选取
print(H[-4:-1]) #从倒数第四个数，到最后一个数(不取最后一个数）
print(H[-4:-1:-1]) #因为[-4:-1]是从左往右数的，而[ ： ：-1]是从右往左数的，所以他们不能相互存在！








#---------字符串的查找------------
# 变量.find()

K="My name is Tony and I am 12 years old and I am very good."
print(K.find("is"))
print(K.find("and", 20))
print(K.find("iddd"))#这里会print “-1”， 如果print “-1”则说明他不存在

# 变量.index()
V="My name is Tony and I am 12 years old and I am very good."
print(V.index("and"))
#print(V.index("id对对对dd"))#这里就会报错

# 变量.count()
Z = "My name is Tony and I am 12 years old and I am very good."
print(Z.count("and"))#出来的数字是 “and”  在 变量中出现的次数
print(Z.count("sssss"))#出来 的数字是0， 意思是出现的次数是0次



# 变量.rfind()   变量.rindex()
# 这些都是从右边开始向左开始找的
# 但是数的时候  还是从左开始往右数



#-----------字符串的修改--------------

#--------replace()替换函数-----------

M = "我真的TM的，学妈的，超级无敌的，加鲁鲁的，凯撒的，宇宙帅！"
M_new= M.replace("TM", "他娘的")
#----------如果调用 变量.replace()，就得用新的变量。原有的变量是不可替换的，这说明了字符串是不可替换的。
print(M)
print(M_new)
L_new=M.replace("的","嗯呐", 3)
#变量.replace( . . 3)后面的这个数字如果超出了原来字符串里出现的次数，就是全部修改。
print(L_new)
O_new=M.replace("的","哈哈哈", 2)
print(O_new)





#------------split()----分割，返回一个列表，但是会丢失本来的字符
H="我的真的真的圆的水的电的费的是的开的发的解的放的军的上的建的立"
U_a=H.split("的")
print(U_a)# 是将一串字符串，以关键字为一个形式，转成列表。

#--------字符或字串join()-----
#将列表 合并成一个字符串
AB=["金", "木", "水", "火", "土"]
print("".join(AB))



#------字符串第一个字母大写-------
#   变量.capitalize()
QW="hello woled sdksj  ajd"
print(QW.capitalize())

#--------字符串所有的单词的第一个字母大写
#  变量.title()
WE="hello woled sdksj  ajd"
print(WE.title())




#------字符串大写转小写-----
#     变量.lower()
ER="TFGYHUOJDISHF"
print(ER.lower())



#------字符串小写转大写-----
#     变量.upper()
YU="sjdfslfjsfj;sjf;sjfweofwofm"
print(YU.upper())


#------删除字符串左侧的空白字符---------
# 变量.lstrip()
UI="  KLAJDLKAJDLADJ  "
print(UI)
print(UI.lstrip())


#------删除字符串右侧的空白字符
# 变量.rstrip()
ZX="  KLAJDLKAJDLADJ  "
print(ZX)
print(ZX.rstrip())


#------删除字符串两侧的空白字符
# 变量.strip()
AS="  KLAJDLKAJDLADJ  "
print(AS)
print(AS.lstrip())











