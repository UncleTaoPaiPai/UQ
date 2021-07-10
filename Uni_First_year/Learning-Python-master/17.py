#----------------递归--------------
#

#   递归的特点是：
#              1.函数内部自己调用自己
#              2.必须有出口


# 函数return 的返回值


def return_num(num):
     #出口
    if num == 1:
        return 1
    return num + return_num(num - 1)

result=return_num(3)
print(result)


