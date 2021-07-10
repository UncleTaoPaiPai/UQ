import socket

if __name__ == '__main__':

    #创建TCP服务端套接字
    TCP_server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

    #设置端口号复用
    TCP_server_socket.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, True)

    #绑定端口号
    TCP_server_socket.bind(("", 8000))

    #设置监听
    TCP_server_socket.listen(128)

    #循环等待接受客户端的连接请求
    while True:

        #等待接受客户端的连接请求
        new_socket, ip_port = TCP_server_socket.accept()

        #代码执行到此，说明连接建立成功

        #接收客户端的请求信息
        recv_data = new_socket.recv(4096)

        #对二进制数据进行解码
        recv_context = recv_data.decode("utf-8")
        print(recv_context)

        #对数据按照空格进行分割
        request_list = recv_context.split(" ", maxsplit=2)

        #获取请求的资源路径
        request_path = request_list[1]
        print(request_path)



        #打开文件读取文件中的数据
        with open("static" + request_path, "r") as file: #这里的file表示打开文件的对象
            file_data = file.read()
        # with open 关闭文件这步操作不用程序员来完成，系统帮我们来完成

        # 响应行
        response_line = "HTTP/1.1 200 OK\r\n"

        # 响应头
        response_header = "Server: PWS/1.0 \r\n"

        # 空行
        # 响应体
        response_body = file_data

        # 把数据封装成HTTP 响应报文格式的数据
        response = (response_line + response_header + "\r\n").encode("utf-8") + response_body



        #发送给浏览器的响应报文数据
        new_socket.send(response)

        #关闭服务于客户端的套接字
        new_socket.close()

