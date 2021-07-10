package firstclass;

import java.util.Scanner;

public class SwitchJIandOU {

    public static void main(String args[]){

        //**************输入界面****************//
        System.out.println("请输入数字：");
        //使用Scanner
        Scanner scanner = new Scanner(System.in);
        //将输入的数据，导入到变量名当中
        int number = scanner.nextInt();



        //***********计算数字***************//
        int switch_num;
        switch_num = number % 2 ;

        switch (switch_num){
            case 0:
                System.out.println("这是双数！");
                break;

            default:
                System.out.println("这是数！");
                break;
        }
    }
}
