#导入进程包
import multiprocessing
import time
import os

#跳舞任务
def dance():
    for i in range(3):
        main_process_id = os.getpid()
        print(main_process_id)
        print("跳舞")
        time.sleep(0.2)

#唱歌任务
def sing():
    for i in range(3):
        main_process_id = os.getpid()
        print(main_process_id)
        print("唱歌")
        time.sleep(0.2)

#创建子进程


dance_process = multiprocessing.Process(target=dance)
sing_process = multiprocessing.Process(target=sing)


if __name__=="__main__":
    dance_process.start()
    sing_process.start()





