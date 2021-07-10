package firstclass;

public class Text {

    public static void main(String args[]){

//        for (int i = 0; i <= 1000; i++){
//
//            if(i % 5 == 0 ){
//                    System.out.println(i+"\t");
//                    count++;


//            }
//        }
        int x = 0, sum = 0;

        while (x<=10){
            sum+=x;
            x++;
            if(x % 2 == 0)
                continue;


        }
        System.out.println(sum);

    }
}
