package firstclass;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class GradeForm {

    public static void main(String args[]){



        //****************输入界面****************//
        System.out.println("请输入你的成绩：");
        //使用scanner
        Scanner scanner = new Scanner(System.in);
        //将输入的数据，导入到变量名当中
        int grade = scanner.nextInt();


//*******************IF做法******************//
        //进行对grade的判断
//        if (90 <= grade & grade <= 100){
//            System.out.println("A级");
//        }else if(80 <= grade & grade < 90){
//            System.out.println("B级");
//        }else if(70 <= grade & grade < 80){
//            System.out.println("C级");
//        }else if(60 <= grade & grade < 70){
//            System.out.println("D级");
//        }else if (0 <= grade & grade < 60){
//            System.out.println("E级");
//        }


//*******************Switch做法********************//
        int result;
        result = grade / 10;
        switch (result){
            case 10:
                System.out.println("A级");
                break;
            case 9:
                System.out.println("A级");
                break;
            case 8:
                System.out.println("B级");
                break;
            case 7:
                System.out.println("C级");
                break;
            case 6:
                System.out.println("D级");
                break;
            default:
                System.out.println("E级");
                break;
        }


    }

}
