public class a {

    public static void num(int num){
        if (num < 0){
            System.out.print("1");
            for (int i = 30; i >= 0; i--){
                System.out.print((num & (1 << i)) == 0 ? "0" : "1");
            }
            System.out.println();
        }else {
            for (int i = 31; i>=0; i--){
                System.out.print((num & (1 << i)) == 0 ? "0" : "1");
            }
            System.out.println();
        }
    }

    public static int factor(int x){
        int sum = 1;
        for (int i =1; i <= x; i++) {
            sum *= i;
        }
        return sum;
    }

    public static void factors(int x){
        int sum = 0;
        for (int i =0; i <= x; i++){
            sum += factor(i);
        }
        System.out.println(sum);
    }

    public static void print(int[] arr){
        for (int i =0; i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void selectSort(int[] arr){
        int len = arr.length;
        for (int i =0; i<len; i++){
            int minValueIndex = i; //设定最小值的坐标
            for (int j = i +1; j < len; j++){
                // 下一个坐标
                if (arr[j] < arr[minValueIndex]) {
                    minValueIndex = j;//如果下一个坐标 小于 上一个坐标 则最小值坐标就变成 下一个坐标数
                }else {
                    // 反之，最小值坐标不变
                    minValueIndex = minValueIndex;
                }
            }
            swap(arr, i, minValueIndex);
        }
    }

    public static void bubbleSort(int[] arr){
        int len = arr.length;
        for (int i = len - 1; i >=0; i--){
            for (int x = 0; x < i; x++) {
                if (arr[x] > arr[x + 1]) {
                    swap(arr,x,x+1);
                }
            }
        }
    }

    public static void insertSort(int[] arr){
        int len = arr.length;
        for (int i = 1; i < len; i++){
            for (int x = i; x > 0; x--) {
                if (arr[x] < arr[x -1]) {
                    swap(arr,x,x-1);
                }
            }
        }
    }



    public static void swap(int[] arr,int left, int right){
        int temp;
        temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }

    public static void main(String[] args) {
        num(-1024);
        num(1024);
        System.out.println(factor(10)+factor(9)+factor(8)+factor(7)+factor(6)+factor(5)+factor(4)+factor(3)+factor(2)+factor(1)+factor(0));
        factors(10);
        int[] arr = {6,7,3,9,1,3,0};
        print(arr);
        insertSort(arr);
        print(arr);


    }
}
