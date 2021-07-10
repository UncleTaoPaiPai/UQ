#   文件处理


#打开

#   open(name, mode)

#name: 文件所在具体路径

#mode: 文件操作
#       打开： open()
f = open("test.txt", "w")
#       读写操作： write() read()
f.write("aaa")
#       关闭： close()
f.close()