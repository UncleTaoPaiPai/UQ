public class class_03 {

    public static int random(){
        return (int)(Math.random()*5)+1;
    }

    public static int restart(){
        int num;
        do {
            num = random();
        }while (num == 3);
        return num < 3?0:1;
    }

    public static int oneToSeven() {
        return (restart() << 2) + (restart() << 1) + (restart() << 0);
    }

    public static int Seven(){
        int num;
        do {
            num = oneToSeven();
        }while (num == 0);
        return num;
    }

    public static void main(String[] args) {
        int len =8;
        int[] count = new int[len];
        int testTimes = 10000000;
        for (int i =0;i<testTimes;i++) {
            int num = Seven();
            count[num]++;
        }
        for (int i =0;i<len;i++){
            System.out.println("第" + i + "是" + (double)(count[i])/testTimes);
        }

    }
}
