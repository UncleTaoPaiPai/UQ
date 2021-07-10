public class class_06 {

    public static int findLeft(int[] arr, int num) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] <= num) {
                ans = mid;
                start = mid + 1;

            }else {
                end = mid -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] x={2,4,4,5,6,6,7,9};
        System.out.println(findLeft(x, 7));
    }
}
