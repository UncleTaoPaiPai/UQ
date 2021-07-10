def choose_func():
    print("请选择功能：")
    print("1.添加学员")
    print("2.删除学员")
    print("3.修改学员信息")
    print("4.查询学员信息")
    print("5.显示所有学员")
    print("6.退出系统")
    print("-"*20)


student_list=[]

def add_stu():
    """添加学员"""

    #输入学员信息：
    student_ID = input("请写入学员的ID")
    student_name=input("请写入学员的名字：")
    student_age=input("请写入学员的年龄：")

    #判断学员是否存在
    global student_list
    for i in student_list:

        if student_list == i["name"]:
            print("该学员以存在！")

            return

    dict_student={}
    dict_student["ID"]=student_ID
    dict_student["name"]=student_name
    dict_student["age"]=student_age

    student_list.append(dict_student)
    print(student_list)


def del_num():
    """删除学员"""

    del_student=input("请输入你要删除的学员名字：")

    global student_list

    for i in student_list:
        if del_student == i["name"]:
            student_list.remove(i)
            print("已删除")
            print(student_list)
        else:
            print("查无此人！")
            print(student_list)
    return

def modify_num():
   """修改学员"""

   modify_student=input("请输入你要修改的学员ID:")
   global student_list

   for i in student_list:
        if modify_student == i["ID"]:
            i["name"]=input("请输入你的新名字：")
            i["age"]=input("请输入你的新年龄：")
            print(student_list)
        else:
            print("差不此人！")
   return


def check_num():
    """查询学员"""

    check_student=input("请输入你要查询的学员ID")
    for i in student_list:
        if check_student == i["ID"]:
            print(i)

        else:
            print("查无此人！")

def appear_num():

    print(student_list)


while True:
    choose_func()

    user_choose=int(input())

    if user_choose == 1:
        print("请写入你要添加的学员：")
        add_stu()

    elif user_choose == 2:
        print("请写入要删除的学员：")
        del_num()

    elif user_choose == 3:
        print("请写入要修改的学员：")
        modify_num()

    elif user_choose == 4:
        print("请写入要查询的学员：")
        check_num()

    elif user_choose == 5:
        print("请写入要显示的学员:")
        appear_num()

    elif user_choose == 6:
        print("退出系统！")
        exit()