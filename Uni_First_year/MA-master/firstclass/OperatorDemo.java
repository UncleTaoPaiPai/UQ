package firstclass;

public class OperatorDemo {
    public static void main(String agrs[]){
//        int a = 1;
//        int b = 1;
//        System.out.println(b++);
//        System.out.println(++a);
//        System.out.println(a++);
//        System.out.println(a);
//        System.out.println(-+b+b+b+b++);

//          int s =1;
//          System.out.println(++s+s++);
//          //    ++s  是  1+s,  这里 s = 1，所以 ++s = 2
//          //    根据以上 ++s = 2， 可以得出 s = 2
//          //    根据定理  谁在前先算谁，  ++s 算出得出后  等于 2
//          //    后面的 +s++  应该就是 2 + s  所以等于 4
//          //    所以 ++s+s++  等于 4
//
//
//           System.out.println(s);
           //   首先这里的 s 指的是 ++s+s++后面的  s++
           //   当 ++s+s++算到  ++s时  s 等于 2
           //   所以 s++ 等于  2+1 = 3
           //   s =  3
//        /**
//         * 单目运算符
//         *      ++， 表示在变量原有的基础上 + 1， 当变量在前时先算变量
//         */


        //逻辑运算符
        /*
        *  &&：(AND)
        *       表示 与运算，两边表达式中只要有一个是false，结果就是false
        *       两边表达式从左向右开始对比，如果左边的表达式是false，右边不需要进行判断
        *
        *  ||：(OR)
        *       表示 或运算，两边表达式中只要有一个是true，整体结果就是true
        *       两边表达式从左向右开始对比，如果左边的表达式是true，右边不需要进行判断
        *
        *  &:
        *       与运算符，但是两边都会参与运算
        *
        *  |：
        *       或运算符，两边都会参与运算
        *
        *  ！：
        *       取反，True取False，False取True
//        * */
//        System.out.println(3>5 && 6>5);
//        System.out.println(3<5 & 3>4);
//        System.out.println(5<3 | 4<3);
//        System.out.println(5>3 || 4<3);
//        System.out.println(!false);

        /*
        * 位运算符：
        *          只能操作数值，操作的时候会转成二进制进行运算
        *  &：
        *       与运算，两边都要是 1 或者 True，结果才为 1 或者 True
        *
        *  |：
        *       或运算，两边只要有一个是 1 或者 True,结果才为 1 或者 True
        *
        *  ^:
        *       异或，相同为0，不同为1
        *
        *  ~：
        *       补码，原码，反码
        *
        *
        *
        * * */

//
//        System.out.println(4 & 5); /*先将4和5化成二进制，然后在进行位运算*/
//        System.out.println(4 | 5);
//        System.out.println(4 ^ 5);
//        System.out.println(~4);
        //  十进制（4）化成二进制为： 0000 0100
        //  然后取反，零变一，一变零
        //  然后 -1
        //  符号位不动，其他位取反零变一，一变零


        /*移位运算
        *
        *       <<:
        *              二进制向左移
        *
        *       >>:
        *              二进制向右移
        * */
//
//        System.out.println(2<<3);/*先将2化为二进制，然后向左边移三位，其得数化为十进制*/
//        System.out.println(16>>4);/*先将16化为二进制，然后向右边移三位，其得数化为十进制*/
//
//        //条件运算符或者三目运算符
//        //使用的时候需要跟一个表达式
//        // 表达式如果是True，则返回？后面的结果
//        // 表达式如果是false，则返回：后面的结果
//        System.out.println(3>2?3:2);
//        System.out.println(true?false:true);



         //基本数据类型之间的转换
        /*          自动转换(隐形转换):
        *           强制转换
        *
        *           注意:
        *               1、 在进行算术运算操作的时候，必须要求数据类型一致，否则无法操作
        *               2、 在运算过程中，如果两个值的类型不一致，会自动将小的类型转换为大的类型
        *               3、 在运算过程中，可以手动强制转换，将大的类型转换为小的类型
        *                    实现方式，（datatype）
        *               4、 强制转换，会发生精度损失，结果可能不准确
        * */

        byte b = 10;
        int a = 10;
        int c;
        c = a + b;

        byte q= 10;
        int w = 200;
        byte e;
        e = (byte) (q + w);
        System.out.println(e);


    }
}
