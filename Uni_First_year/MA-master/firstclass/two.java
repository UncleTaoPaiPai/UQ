package firstclass;

import java.util.Scanner;

public class two {

    public static void main(String args[]){

        int b = 0;
        int a = 100;
        int c= 0;
        String str= "";
        while(a!= 0){
            b=a/2;//商
            c=a%2;//余数
            a=b;//被除数
            str=c+str;

        }
        System.out.println(str);

    }
}
