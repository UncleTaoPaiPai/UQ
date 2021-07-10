package firstclass;

import java.util.Scanner;

public class Season {

    public static void main(String args[]){

        //**************输入界面*****************//
        System.out.println("请输入月份：");
        //使用Scanner
        Scanner scanner = new Scanner(System.in);
        //将输入的数据，导入到变量名当中
        int season = scanner.nextInt();

        //******************判断月份*****************//
        if (1 <= season & season <= 3){
            System.out.println("春天-春暖花开"+"\t"+"春意盎然-植树"+"\t"+"踏青");
        }else if(4 <= season & season <= 6){
            System.out.println("夏天-夏日炎炎"+"\t"+"夏雨雨人-游泳"+"\t"+"吃雪糕");
        }else if(7 <= season & season <= 9){
            System.out.println("秋天-秋高气爽"+"\t"+"秋色宜人-吃果子"+"\t"+"收麦子");
        }else if(10 <= season & season <= 12){
            System.out.println("冬天-冰天雪地"+"\t"+"白雪皑皑-堆雪人"+"\t"+"滑雪");
        }
    }
}
