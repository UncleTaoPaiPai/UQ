package firstclass;

import java.util.Scanner;

public class IFNumberJIOU {

    public static void main(String arhs[]){

        //************输入界面********************//
        //打印界面
        System.out.println("请输入数字：");
        //使用Scanner
        Scanner scanner = new Scanner(System.in);
        //将输入的数据，导入到变量中
        int number = scanner.nextInt();



        //*************判断数字****************//
        if(number % 2 == 0){
            System.out.println("这个数字是偶数！");
        }else{
            System.out.println("这个数字是单数！");
        }

    }
}
