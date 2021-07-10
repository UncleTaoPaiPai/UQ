package firstclass;

import java.util.Scanner;

public class SecurityOfNumber {

    public static void main(String agrs[]){

//        //******************输入界面****************
        System.out.println("请输入一个4位正整数：");
        //使用Scanner
        Scanner scanner = new Scanner(System.in);
        //将输入的数据，导入到变量名当中
        int number = scanner.nextInt();
//
//
//
//        //**************加密中***************//
        int bit1 = number / 1000;
        int bit2 = ((number / 100)%10);
        int bit3 = ((number /10) %10) ;
        int bit4 = (number % 10);
        bit1 = (bit1 + 5 ) % 10;
        bit2 = (bit2 + 5 ) % 10;
        bit3 = (bit3 + 5 ) % 10;
        bit4 = (bit4 + 5 ) % 10;
//
//        //***************输出界面*************//
        System.out.println("加密后的数字为："+bit4+bit3+bit2+bit1);

//        int i = 1;
//        int j;
//        j=i++;
//        System.out.println(i);
//        System.out.println(j);
        char i = 2+'2';
        System.out.println(1+1);
    }

}
