#打印五行“*” 和 五列“*”
j=0
while j <= 4:
    i=0
    while i <= 4:
        print("*", end="")
        i += 1
    print()#-----print()-----这个有默认换行的功能-----
    j += 1


#打印星号（三角形）
j = 0
while j <= 4:
    i = 0
    while i <= j: # j表示行数， i表示一列有几个“*”
        print("*",end="")
        i += 1
    print()
    j += 1

#九九乘法表
j = 1
while j <= 9:
    i = 1
    while i <= j:
        print(f'{i} * {j} = {i * j}', end="\t")
        i += 1

    print()
    j += 1





