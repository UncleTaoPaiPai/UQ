package firstclass;
import java.util.Scanner;

public class PrintlnYourNameAgeGender {
    public static void main(String args[]){

        //***********************名字**********************//
        //打印 “Please input your name here”
        System.out.println("Please input your name here:");
        //使用scanner
        Scanner scanner = new Scanner(System.in);
        //将输入的数据，导入到变量名当中
        String name = scanner.nextLine();



        //***********************年龄***********************//
        //打印 “Please input your age here"
        System.out.println("Please input your age here:");
        //使用Scanner
        Scanner scanner1 = new Scanner(System.in);
        //将输入的数据，导入到变量名当中
        int age = scanner1.nextInt();



        //**********************性别***********************//
        //打印“Please input your gender here”
        System.out.println("Please input your gender here:");
        //使用Scanner
        Scanner scanner2 = new Scanner(System.in);
        //将输入的数据，导入到变量名当中
        String gender = scanner2.nextLine();




        //打印“The computer recorded that :”
        System.out.println("The computer recorded that :");

        //将导入的name变量名，放入打印出来的“Your name is:"里面
        System.out.println("Your name is:"+name);

        //将导入的age变量名，放入打印出来的“Your age is:"里面
        System.out.println("Your name is:"+age);

        //将导入的age变量名，放入打印出来的“Your age is:"里面
        System.out.println("Your name is:"+gender);

    }
}
