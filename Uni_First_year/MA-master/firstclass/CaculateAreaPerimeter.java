package firstclass;
import java.util.*;
import java.math.*;

public class CaculateAreaPerimeter {

    public static void main(String args[]){

        //******************输入界面*****************//
        //打印“请输入圆的半径：”
        System.out.println("请输入圆的半径：");
        //使用Scanner
        Scanner scanner = new Scanner(System.in);
        //将导入的数据，放入变量名当中
        int r = scanner.nextInt();



        //*************计算圆的面积**************//
        //计算圆的周长
        double Permeter = 2 * r * Math.PI;
        //计算圆的面积
        double Area = r * r * Math.PI;



        //*************输出界面****************//
        //打印圆的半径
        System.out.println("该圆的半径为：R="+r);
        //打印圆的周长
        System.out.println("该圆的周长为：C="+Permeter);
        //打印圆的面积
        System.out.println("该圆的面积为："+Area);


    }

}
