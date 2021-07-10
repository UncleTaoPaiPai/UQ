package firstclass;
import java.util.Scanner;

/*
*       判定素数的方法：
*               1.首先这个数必须大于1
*                   1.2 只能被他本身整除 / x == 0
*                       不能被他本身整除的数 就不是素数
*
*                   if条件、while， for循环
* */



public class PrimeNumber {
    public static void main(String args[]) {
        //********************输入界面*******************//
        System.out.println("请输入数字：");
        //使用Scanner
        Scanner scanner = new Scanner(System.in);
        //将输入的数字，导入到变量名当中
        int number = scanner.nextInt();
        //******************判断数字********************//
        //设一个判定值
        boolean Prime = true;
        if (number == 1){
            Prime = false;
        }else{
            for (int i=2; i < number; i++ ){
                if(number % i == 0) {
                    Prime = false;
                    break;
                }
            }
        }
        if (Prime){
            System.out.println("素数");
        }else {
            System.out.println("不是素数");
        }
    }
}