import multiprocessing
import time
import os

def sing():
    print("sing的子进程", os.getpid())
    print("sing的父进程", os.getppid())
    for i in range(3):
        print("唱歌中。。。")
        time.sleep(2)

def dance():
    print("dance的子进程", os.getpid())
    print("dance的父进程", os.getppid())
    for i in range(3):
        print("跳舞中。。。")
        time.sleep(2)

sing_process = multiprocessing.Process(target=sing)
dance_process = multiprocessing.Process(target=dance)



if __name__== "__main__":
    print("主进程", os.getpid())
    sing_process.start()
    dance_process.start()