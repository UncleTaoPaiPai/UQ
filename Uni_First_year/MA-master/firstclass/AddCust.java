package firstclass;

import java.util.Scanner;

public class AddCust {
    public static void main(String agrs[]){
        System.out.println("欢迎光临会员系统");
        System.out.println("添加用户信息");

        //创建Scanner对象
        Scanner sc = new Scanner(System.in);

        //输入会员号码
        System.out.println("请输入会员号码<4位整数>");
        String number = sc.nextLine();

        //输入会员生日
        System.out.println("请输入会员生日<日/月>");
        String birthday = sc.nextLine();

        //输入会员积分
        System.out.println("请输入会员积分");
        String score = sc.nextLine();


        //对用户输入的会员号码进行判断
        if (number.length()==4){
            //如果用户输入会员号码正确:
            System.out.println("会员信息如下:");
            System.out.println(number + "\t"+ score);

        }else{
            //如果用户输入会员号码不正确:
            System.out.println("会员号码输入错误，请输入4位整数");
        }
    }
}
