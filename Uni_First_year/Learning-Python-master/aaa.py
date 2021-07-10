import os


def del_file(path):
    A = os.path.exists(path)
    if A:
        os.removedirs(path)

file=input("请输入你的地址：")
del_file(file)

