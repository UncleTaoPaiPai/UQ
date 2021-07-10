package firstclass;

import java.util.Scanner;

public class FatherBuy {

    public static void main(String args[]){

        //输入界面
        System.out.println("请输入你的成绩：");
        //使用Scanner
        Scanner scanner = new Scanner(System.in);
        //将是输入的值，保存到变量名当中
        int grade = scanner.nextInt();

        if (grade >= 90){
            System.out.println("给你买电脑！");
        }else if(90 > grade & grade  >= 80){
            System.out.println("给你买手机！");
        }else if(80 > grade & grade >=60){
            System.out.println("请你吃大餐！");
        }else if(grade < 60 ){
            System.out.println("给你买学习资料！");
        }
    }
}
