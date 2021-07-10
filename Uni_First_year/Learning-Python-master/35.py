#导入模块
import threading
import time

list=0
lock=threading.Lock()
#唱歌任务
def task1():
    lock.acquire()
    for i in range(1000000):
        global list
        list += 1

    print("列表1为：", list)
    lock.release()

def task2():
    lock.acquire()
    for i in  range(1000000):
        global list
        list += 1
    print("列表2为:",list)
    lock.release()
if __name__=="__main__":

    task1_thread=threading.Thread(target=task1)
    task2_thread=threading.Thread(target=task2)
    task1_thread.start()
    # task1_thread.join()
    task2_thread.start()