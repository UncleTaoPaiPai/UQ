#                   面向对象三大特征

#   封装  继承  多态

Z=[("192.168.1.109",6000),("192.168.1.109",None),("192.168.2.255",8000),("192.168.100.200",8080),("192.168.1.8600",6000),("192.168.1.199",8000),("192.168.1.500",6000),("192.168.1.50",80000),("192.168.1.50",'80000')]
#端口号：
del Z[1]
del Z[7]
del Z[6]


#0. IP
A=Z[0][0]
A1=A.split(".")
print(A1)
if (0<int(A1[0])<=255) and (0<int(A1[1])<=255) and (0<int(A1[2])<=255) and (0<int(A1[3])<=255):

    print(Z)
else:
    del Z[0]



#1. IP
B=Z[1][0]
B1=B.split(".")
print(B1)
if (0<int(B1[0])<=255) and (0<int(B1[1])<=255) and (0<int(B1[2])<=255) and (0<int(B1[3])<=255):

    print(Z)
else:
    del Z[1]


#2. IP
C=Z[2][0]
C1=C.split(".")
print(C1)
if (0<int(C1[0])<=255) and (0<int(C1[1])<=255) and (0<int(C1[2])<=255) and (0<int(C1[3])<=255):

    print(Z)
else:
    del Z[2]


#3. IP
D=Z[3][0]
D1=D.split(".")
print(D1)
if (0<int(D1[0])<=255) and (0<int(D1[1])<=255) and (0<int(D1[2])<=255) and (0<int(D1[3])<=255):

    print(Z)
else:
    del Z[3]


#4. IP
E=Z[4][0]
E1=E.split(".")
print(E1)
if (0<int(E1[0])<=255) and (0<int(E1[1])<=255) and (0<int(E1[2])<=255) and (0<int(E1[3])<=255):

    print(Z)
else:
    del Z[4]


#格式正确的IP地址和端口号
print(Z)

