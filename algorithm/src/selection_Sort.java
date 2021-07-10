public class selection_Sort {

//    public static void change(int x, int y){
//        int temp;
//        temp = x;
//        x = y;
//        y = temp;
//    }
//
    public static void findmin(int arr[]){
       int minpos=0;
       for (int i =0; i < arr.length-1; i++) {
           minpos = i;
           for (int x = i+1; x < arr.length; x++){
               if(arr[minpos]<arr[x]){
                   minpos = x;
               }
           }
           int temp;
           temp = arr[i];
           arr[i] = arr[minpos];
           arr[minpos] = temp;
       }
    }

    public static void print(int arr[]) {
        for (int x =0; x < arr.length; x++){
            System.out.print(arr[x]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {8,2,5,0,5,3,9,1};
        findmin(arr);
        print(arr);
    }
}
