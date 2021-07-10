import socket

if __name__== "__main__":

    TCP_Client_Socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM )
    #创建tcp客户端套接字
    #AF_INET: 为ipv4地址类型
    #SOCK_STREAM: TCP传输协议类型

    TCP_Client_Socket.connect(("192.168.126.128", 8080))
    #和服务端建立连接

    send_connect = "你好，我是Tony"
    send_data=send_connect.encode("utf-8")
    #windows里面的网络调试助手使用的是gbk
    #Linux里面的网络调试助手使用的是utf-8

    TCP_Client_Socket.send(send_data)
    # 将发送的数据转成二进制
    #发送数据给服务端

    Recv_data=TCP_Client_Socket.recv(1024)
    # 1024：表示每次接受的最大字节数
    Recv_data_context = Recv_data.decode("utf-8")
    # 将收到的数据转成二进制
    #从服务端接受数据

    print(Recv_data_context)

    TCP_Client_Socket.close()
    #关闭套接字