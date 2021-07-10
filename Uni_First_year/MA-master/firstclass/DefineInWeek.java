package firstclass;

import java.util.Scanner;

public class DefineInWeek {

    public static void main(String args[]){

        System.out.println("请输入英文单词：");
        Scanner scanner = new Scanner(System.in);
        String week = scanner.nextLine();

        char letter;
        char LetterNext;
        letter = week.charAt(0);
        LetterNext = week.charAt(1);
        switch (letter){
            case 'm' :
                System.out.println("周一");
                break;
            case 'M' :
                System.out.println("周一");
                break;
            case 't':
                 if (LetterNext == 'u'){
                     System.out.println("周二");
                 }else{
                     System.out.println("周四");
                 }
                 break;
            case 'T':
                if (LetterNext == 'u'){
                    System.out.println("周二");
                }else{
                    System.out.println("周四");
                }
                break;
            case'w':
                System.out.println("周三");
                break;
            case'W':
                System.out.println("周三");
                break;
            case 'f':
                System.out.println("周五");
                break;
            case 'F':
                System.out.println("周五");
                break;
            case 's':
                switch (LetterNext){
                    case('a' | 'A'):
                        System.out.println("周六");
                        break;
                    case('u' | 'U'):
                        System.out.println("周日");
                        break;
                }
                break;
            case 'S':
                switch (LetterNext){
                    case('a' | 'A'):
                        System.out.println("周六");
                        break;
                    case('u' | 'U'):
                        System.out.println("周日");
                        break;
                }
                break;
        }

    }
}
