package firstclass;

/*
* 数据类型：
*
*      JAVA是一种强类型的语言
*              强类型表示，变量在定义的时候必须显示的声明类型是什么           java
*              弱类型表示，变量会根据值自己去推断，不需要指定类型是什么        js,python,scala
*
*      JAVA数据类型：
*
*           基本数据类型（4种8类）：
*               整数类型： byte  short  int  long（不同类型表示不同的长度）
*                   byte:   使用一个字节存储，因此范围是  -128~127
*                   short:  使用两个字节存储，因此范围是  -32768~32767
*                   int:    使用四个字节存储，因此范围是  正负21亿
*                   long:   使用八个字节存储，因此范围是  。。。。。
*                   注意：
*                       1、在使用整型类型的时候，默认都是int类型，
*                       2、如果需要使用long类型的话，必须要在数字的后面添加L建议使用大写，小写容易跟1混淆
*
*               浮点类型:  float  double
*                   float:  单精度,精度可以精确到小数点后7位
*                   double: 双精度，精度是float的双倍
*                     注意：
*                        1、默认浮点类型是double类型
*                        2、使用float的时候，数字后面要添加F（大小写无所谓）
*                        3、浮点类型并不能表示一个精确的值，会损失一定的精度
*
*               字符类型： char
*
*               布尔类型： boolean
*
*                   只有true和false两值，在存储的时候占1位
*             引用数据类型
* */

public class DataTypeDemo {
    public static void main(String args[]){

            byte b = 127;
            short s = 777;
            int i = 777777777;
            long x = 7777777777777777L;

            float a = 7.77777F;
            float c = 7.7777777777777F;
            System.out.println(a == c);

              /*表示一个字符*/
              char m = 't';

              /*表示一个字符串，表示一个字符序列*/
              String o = "s";
              System.out.println(m == 66);

              /*制表符---空格*/
              char h = '\t';
              System.out.println("["+ h +"]");



    }

}
