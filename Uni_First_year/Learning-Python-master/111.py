

#博客内容:
blog=[]
# #粉丝内容
fans=[]
# #关注的博主
following=[]
# #
blog_writing = {}
#
# #博主功能：
def fuction_for_blog():
    print("-" * 23)
    print("------博主功能界面------")
    print("以下是博主功能：")
    print("1.发博客")
    print("2.查看已发的博客")
    print("3.查看粉丝")
    print("0.退出系统")

# #粉丝功能：
def fuction_for_fans():
    print("------粉丝功能界面------")
    print("以下是粉丝功能：")
    print("4.关注博主")
    print("5.取消关注博主")
    print("6.评论博客")
    print("0.退出系统")

# #类--博客
class bloger(object):

    def blog_create(self):

        global blog
        blog_name=input("请输入你要创建的博主名字：")
        blog_writing["name"]=blog_name
        blog.append(blog_writing)


    def send_blog(self):

        global blog

        blog_ID=int(input("请输入你的ID："))
        blog_write=input("请开始写你的博客:")
        blog_writing["ID"]=blog_ID
        blog_writing["content"]=blog_write
        blog.append(blog_writing)
        print(blog_writing)

    def check_blog(self):

        print(blog)

    def check_fans(self):

        print(fans)

class fan(object):

    def fan_create(self):
        pass



    def follow(self):

        key_of_follow=input("请输入你要关注的博主名字：")

        for i in blog:

            if key_of_follow == i:
                fans.append(key_of_follow)

            else:
                print("查无此人！")

    def nofollow(self):

        key_of_nofollow=input("请输入你要取消关注的博主名字：")

        for i in blog:

            if key_of_nofollow == i:
                fans.remove(key_of_nofollow)

            else:
                print("查无此人！")

    def comment_blog(self):

        Sina.check_blog()
        commenting =int(input("请输入你要评论博客的ID:"))
        for i in blog:
            if commenting == i["ID"]:
                comment_context = input("请输入你的评论：")
                blog_writing["comment"] = comment_context
                blog.append(blog_writing)
                Sina.check_blog()
            else:
                print("查无此博客")


#
#
#
#
#
# #对象--新浪博客
Sina=bloger()
# #对象--粉丝
faner=fan()





Sina.blog_create()
while 1:
# #新浪博客--登入界面
    print("提示:登入博主输入'1',登入粉丝输入'2'")
    User = int(input("请输入："))

#
#     # 新浪博客--博主登入界面
#

    if User == 1:
        fuction_for_blog()


        function_of_blog=int(input("请输入功能："))

        if function_of_blog == 1:

#             #发博客
            Sina.send_blog()

        elif function_of_blog == 2:

#             #查看博客
            Sina.check_blog()

        elif function_of_blog == 3:

#             #查看粉丝
            Sina.check_fans()

        elif function_of_blog == 0:
#             #退出系统
            exit()

        else:
            print("输入错误请重试！")
#
#     # 新浪博客--粉丝登入界面
    elif User == 2:
        fuction_for_fans()

        function_of_blog = int(input("请输入功能："))
        if function_of_blog == 4:

#             #关注博主
            faner.follow()
            print(following)

        elif function_of_blog == 5:
#
#             #取消关注博主
            faner.nofollow()
            print(following)



        elif function_of_blog == 6:
#             #评论博客
            faner.comment_blog()

        elif function_of_blog == 0:
#             #退出系统
            exit()

        else:
            print("输入错误请重试！")

    else:
        print("输入错误请重试！")

