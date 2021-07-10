package firstclass;
import java.util.*;
import java.math.*;

public class BankRate {

    public static void main(String args[]){



        //**************银行界面**************//
        System.out.println("=================以下是银行利率表==================");
        System.out.println("利率项目"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"年利率(%)");
        System.out.println("活期贷款"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"0.35");
        System.out.println("三个月定期存款"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"1.10");
        System.out.println("半年定期存款"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"1.30");
        System.out.println("一年定期存款"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"1.50");
        System.out.println("二年定期存款"+"\t"+"\t"+"\t"+"\t"+"\t"+"\t"+"2.10");



        //**************输入界面***********//
        System.out.println("请输入你要存入银行的本金：");
        //使用Scanner
        Scanner scanner = new Scanner(System.in);
        //将输入的数据，存入变量名里面
        int money = scanner.nextInt();



        //***************计算年利率***************//
        //设置年利率
        double RateOfOneyearLive = 0.0035;
        double RateOfOneyearFocus = 0.015;
        //计算活期一年
        double OneYearLive = money + money * RateOfOneyearLive;
        //计算定期一年
        double OneYearFocus = money + money * RateOfOneyearFocus;



        //****************输出界面***************//
        System.out.println("本金为:"+money);
        System.out.println("活期1年本金总计：" + Math.round(OneYearLive));
        System.out.println("活期1年定金总计：" + Math.round(OneYearFocus));
        System.out.println("活期2年本金总计：" + Math.round(OneYearLive * 2));
        System.out.println("活期2年定金总计：" + Math.round(OneYearFocus * 2));


    }
}
