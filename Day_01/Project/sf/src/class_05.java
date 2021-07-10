public class class_05 {

    public static boolean find(int[] arr, int num) {
        int start = 0;
        int end = arr.length -1;
        while (start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] == num) {
                return true;
            }else if(arr[mid] < num) {
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,9};
        System.out.println(find(arr, 8));
    }
}
