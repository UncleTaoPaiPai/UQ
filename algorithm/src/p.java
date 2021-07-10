public class p {
    /*
    *   Finished By : Yongzhi ZHOU
    *   Date: 2021/5/22
    * */
    public  static void  change(int[] arr, int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static  void insert(int[] arr){
        /*
        *  插入排序：
        *      从arr[1]坐标开始往下进行对比
        *      如果该坐标比其上一个坐标小，就往左边移动
        * */
        for (int i = 1; i < arr.length-1; i ++){
            for (int j = i-1;j>0;j--){
                if(arr[i]<arr[j]){
                    change(arr,i,j);
                }
            }
        }
    }

    public static void bubble(int[] arr){
        /*
        *  冒泡排序：
        *       在一个数组中，找到最大的值，将他移动到最右边
        *       当最右边的位置满足条件后，依次向左遍历循环
        * */
        for (int i =arr.length-1;i>=0;i--){
            for (int j = 0; j < i;j++){
                if(arr[j]<arr[j+1]){
                    change(arr,j,j+1);
                }
            }
        }
    }

    public static  void selection(int[] arr){
        /*
        *  选择排序：
        *       设一个最小值的坐标
        *       循环将第一个值赋予该坐标
        *       循环在第一个值上面+1，也赋予该坐标
        *       两个值，两个坐标进行比较，谁大谁往左边移动
        * */
        //设置一个最小值的坐标
        int minpos = 0;
        for (int i = 0;i<arr.length;i++){
            //将i赋予最小值坐标minpos
            minpos =i;
            //再进行嵌套循环，将最小值，也赋予minpos
            for (int j = i+1; j<arr.length; j++){
                if (arr[i] > arr[j]){
                    minpos = j;
                }
            }
            change(arr,i,minpos);
        }
    }

    public static void print(int arr[]) {
        for (int x =0; x < arr.length; x++){
            System.out.print(arr[x]+" ");
        }
    }

    public static void main(String[] args) {
//        int arr[] = {8,2,5,0,5,3,9,1};
//        insert(arr);
//        print(arr);
        while (true) {
            System.out.println("你好棒");
        }
    }
}
