public class class_01 {

    public static void print(int[] arr){
        for (int x = 0; x<arr.length;x++){
            System.out.print(arr[x]);
        }
        System.out.println();
    }

    public static void bitPrint(int x){
        int num = 0;
        for (int i = 31; i >=0; i--){
            if((x & (1 << i)) != 0){
                num +=1;
            }
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        bitPrint(10);

    }
}
