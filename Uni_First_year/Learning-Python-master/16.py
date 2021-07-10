#-----------------学院管理系统--------------



#  存储学员信息的列表
student=[]



# 功能界面
def sel_function():
    print("请选择功能：")
    print("1.添加学员")
    print("2.删除学员")
    print("3.修改学员信息")
    print("4.查询学员信息")
    print("5.显示所有学员")
    print("6.退出系统")
    print("-"*20)


# 添加学员功能函数：
def add_num():
    """添加学员函数"""

    #1. 输入学号，名字，手机号
    student_id=input("请输入你的学号：")
    student_name=input("请输入你的名字：")
    student_phone = input("请输入你的手机号：")

    global student # 运用global函数，有全局变量的作用。是为了让刚进来的数据在列表里面存在

    # 2.判断这个学员，如果学员存在报错，不存在放入加入列表
    for i in student:
        if student_name == i["Name"]:
            print("此用户已经存在，请重新输入！")

            return
    # return 的作用是 返回值 还有，退出当前函数。 在这里的作用是： 当这个for函数运行完之后，发现跟列表里面的一样。就退出当前函数。
    # 如果不加则return后面的代码会运行。会把重复的代码写入进字典（列表）里面。


    #2. 将输入的数据 放入字典中，最后加入到列表里

    dict_student={}     #创建字典
    dict_student["ID"]=student_id
    dict_student["Name"]=student_name
    dict_student["Phone"]=student_phone


    #      *Tip: 在这里先用字典，然后加入到列表里面是为了起到 这种效果：
    #     [{...}, {...}, {...}]  每一个字典里面都存在每个人的信息，然后最后到一个大列表里面

    student.append(dict_student)    #将字典，放进列表里
    print(student)



    # 删除学员功能函数

def del_num():

    del_student=input("请输入你想删除的名字：")

    global student# 将去除名字 重申进列表

    for i in student:

        if del_student == i["Name"]:

            student.remove(i)
            print("已完成！删除你想删除的名字！")
            print(student)
            return
        else:
            print("不存在删除的名字，请重试！")
            print(student)


    #   修改学员信息

def modify_num():

    modify_student = input("请输入你要修改的学员ID：")


    global student

    for i in student:
        if modify_student == i["ID"]:
            i["Name"] = input("请输入新的学员名字：")
            i["Phone"] = input("请输入与新的学员手机：")
            break

    else:
        print("未发现此学员信息！请重试")
    print(student)



    #   查询学员信息
def search_num():

    search_student_ID=input("请输入你要查找的学员ID")



    global student

    for i in student:

        if search_student_ID == i["ID"]:

            print("'Name':" + i["Name"] + "'Phone':" + i["Phone"])

        break
    else:
        print("没有改学员的信息！")


    # 显示学员信息：

def appear_num():

    print(student)
    # for i in  student:
    #     print(i)
    # return



    #   退出系统：

def exit_game():
    exit()







while 1:   #while 1 或者while True 其作用是使该while函数不停的循环而不是按一次就停下来了。
    # 1.显示功能序号
    sel_function()


    # 2.用户输入功能序号
    user_selnum=int(input("请输入功能序号:"))

    # 3.按照用户输入功能序号的不同，执行不同的功能
    #
    #
    #   如果用户输入(1),执行添加，输入(2),执行删除......
    if user_selnum == 1:
        print("添加")
        add_num()

    elif user_selnum == 2:
        print("删除")
        del_num()

    elif user_selnum == 3:
        print("修改")
        modify_num()

    elif user_selnum == 4:
        print("查询")
        search_num()

    elif user_selnum == 5:
        print("显示所有学员")
        appear_num()

    elif user_selnum == 6:
        print("退出")
        exit()

    else:
        print("输入的功能序号有误！")





