public class insert_Sort {
    public  static void  change(int[] arr, int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int arr[]) {
        for (int x =0; x < arr.length; x++){
            System.out.print(arr[x]+" ");
        }
    }

    public static void insert(int[] arr){
       for (int i = 1; i < arr.length; i++){
           for (int j = i; j >0; j--){
               if(arr[j] < arr[j-1]){
                   change(arr,j,j-1);
               }
           }
       }
    }

    public static void main(String[] args) {
        int arr[] = {8,2,5,0,5,3,9,1};
        insert(arr);
        print(arr);
    }
}
