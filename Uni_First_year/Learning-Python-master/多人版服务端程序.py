import socket
import threading

def handle(ip_port, new_client):
    print("客户端的ip和端口号为：", ip_port)

    # 接受客户端的数据
    # 收发消息都使用返回的这个新的套接字

    #循环接收客户端的消息
    while True:
        recv_data = new_client.recv(1024)

        if recv_data:
            # 进行编码转换，变成字符串
            recv_content = recv_data.decode("utf-8")
            print("接受客户端的数据为：", recv_content, ip_port)

            # 发送数据
            send_context = "问题正在处理中。。。"
            # 对数据进行编码
            send_data = send_context.encode("utf-8")
            # 向客户端发送数据
            new_client.send(send_data)

        else:
            #客户端关闭连接
            print("客户端下线了", ip_port)
            break

    # 关闭服务与客户端套接字
    new_client.close()


if __name__ == '__main__':

    #创建服务端套接字
    TCP_server_socket=socket.socket(socket.AF_INET, socket.SOCK_STREAM)

    #绑定端口号
    #第一个参数表示IP地址，一般不用指定，表示本机的任何一个IP即可
    #第二个参数表示端口号
    TCP_server_socket.bind(("", 9090))

    #设置监听
    #128, 表示最大等待建立连接的个数
    TCP_server_socket.listen(128)

    #等待接受客户端的连接请求
    #每当客户端和服务端建立连接成功都会返回一个新的套接字
    #TCP_server_socket只负责等待接受客户端的连接请求，收发消息不使用该套接字

    #循环等待客户端的连接
    while True:
        new_client, ip_port = TCP_server_socket.accept()
        #代码执行到此，说明客户端和服务端建立连接成功

        #当客户端和服务端建立连接成功，创建子线程，让子线程专门负责接收客户端的消息
        sub_thread=threading.Thread(target=handle, args=(ip_port, new_client))
        #设置守护主线程，主线退出子线程直接销毁
        sub_thread.setDaemon(True)
        sub_thread.start()




    #关闭套接字
    TCP_server_socket.close()