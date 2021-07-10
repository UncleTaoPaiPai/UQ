public class class_02 {

    public static double xToXPower2(){
        return  Math.max(Math.random(), Math.random());
    }

    public static double xToXPower3(){
        return  Math.max(Math.random(), Math.max(Math.random(),Math.random()));
    }

    public static void main(String[] args) {
        System.out.println("测试开始");
        double ans = Math.random();
//        System.out.println(ans);

        int testTimes = 1000000;
        int count = 0;
        for (int i =0; i <testTimes; i++) {
            if (Math.random()  < 0.7){
                count++;
            }
        }
        System.out.println(((double) count / (double)testTimes));
        System.out.println("==========");

        int len =9;
        int counts[] = new int[len];
        for (int i = 0; i < testTimes; i++){
            int answ = (int)(Math.random() * len);
            counts[answ]++;
        }
        System.out.println(counts[1]);
        for (int i =0; i < len;i++){
            System.out.println("第" + i + "出现了" + counts[i]);
        }
        System.out.println("==============");
//        int testTimes = 1000000;
        int countss = 0;
        for (int i =0; i <testTimes; i++) {
            if (xToXPower2()  < 0.7){
                countss++;
            }
        }
        System.out.println(((double) countss / (double)testTimes));
//        System.out.println(xToXPower());
        System.out.println(Math.pow(0.7, 2));


    }
}
