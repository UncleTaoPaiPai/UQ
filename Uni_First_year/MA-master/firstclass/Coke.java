package firstclass;

import java.util.Scanner;

public class Coke {

    public static void main(String args[]){

        System.out.println("请输入你的金额：");

        Scanner scanner = new Scanner(System.in);
        //本金
        int money = scanner.nextInt();

        //一瓶可乐的价格
        int Coke = 3;

        //购买可乐的总瓶数
        int sum =0;

        //购买一瓶可乐
        int Bottom =0;

        //买完可乐剩下的钱
        int rest;

        while(money>= Coke){

            //买可乐
            Bottom = money / Coke;
            //购买可乐的总瓶数
            sum=sum+Bottom;

            //一次性购买可乐剩下的钱
            rest = money % Coke;

            //退瓶子的钱
            int BottomMoney = (money / Coke) * 1;

            //放入到本金里
            money = rest + BottomMoney;



        }
        System.out.println(sum);

    }
}
