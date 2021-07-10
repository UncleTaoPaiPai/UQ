public class bubble_Sort {

    public  static void  change(int[] arr, int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void bubble(int arr[]){
        for (int i = arr.length-1;i>0;i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    change(arr, j, j + 1);
                }
            }
        }
    }

    public static void print(int arr[]) {
        for (int x =0; x < arr.length; x++){
            System.out.print(arr[x]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {8,2,5,0,5,3,9,1};
        bubble(arr);
        print(arr);
    }
}
