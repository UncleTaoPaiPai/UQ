package firstclass;

import java.util.Scanner;

public class Shopping {

    public static void main(String args[]){


        //商店界面
        System.out.println("################################################################################");
        System.out.println("请选择购买的商品数量：");
        System.out.println("1、T恤"+"\t"+"\t"+"\t"+"2、网球鞋"+"\t"+"\t"+"\t"+"3、网球拍"+"\t"+"\t"+"\t");
        System.out.println("################################################################################");

        double totalOne=0;
        double totaltwo=0;
        double totalthree=0;
        double Total=0;

        //开始键
        boolean start = true;

        do {

            //购买界面
            System.out.println("请输入商品编号：");
            Scanner scanner = new Scanner(System.in);
            int Mark = scanner.nextInt();

            System.out.println("请输入购买数量：");
            Scanner scanner1 = new Scanner(System.in);
            int number = scanner1.nextInt();
            if (Mark == 1) {

                totalOne = number * 245.00;
                System.out.println("T恤：￥245.00" + "\t" + "\t" + "\t" + "数量：" + number + "\t" + "\t" + "\t" + "合计： ￥" + totalOne);

            } else if (Mark == 2) {

                totaltwo = number * 570.00;
                System.out.println("网球鞋：￥570.00" + "\t" + "\t" + "\t" + "数量：" + number + "\t" + "\t" + "\t" + "合计： ￥" + totaltwo);

            } else if (Mark == 3) {


                totalthree = number * 320.00;
                System.out.println("网球拍：￥320.00" + "\t" + "\t" + "\t" + "数量：" + number + "\t" + "\t" + "\t" + "合计： ￥" + totalthree);

            }
            Total = Total + totalOne + totalthree + totaltwo;
            System.out.println("是否继续(YES/NO):");
            Scanner scanner2 = new Scanner(System.in);
            String ContinueShop = scanner2.nextLine();

            start = ContinueShop.equals("YES");
        }while(start);

        //付钱界面
        System.out.println("折扣：0.8");
        System.out.println("应付金额："+Total);
        System.out.println("请付钱：");
        Scanner scannerMoney = new Scanner(System.in);
        int PayMoney = scannerMoney.nextInt();
        System.out.println("实付金额："+PayMoney);

            if (PayMoney<Total){

                System.out.println("您付的钱小于应付的钱，请重新付钱！");
                Scanner scanner3 = new Scanner(System.in);
                int RestartMoney;
                RestartMoney= scanner3.nextInt();
                PayMoney = PayMoney + RestartMoney;

            }

        System.out.println("正在找钱中，请稍后...");
        System.out.println("找钱："+(PayMoney-Total));







    }
}
