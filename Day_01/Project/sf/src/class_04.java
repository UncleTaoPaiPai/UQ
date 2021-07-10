public class class_04 {

    public static int[] randomList(int maxLen, int maxValue){
        int len;
        len = (int) (Math.random()*maxLen);
        int[] nums = new int[len];
        for (int i =0;i<len;i++){
            nums[i] = (int)(Math.random()*maxValue);
        }
        return nums;
    }

    public static int[] copyList(int[] arr){
        int[] ans = new int[arr.length];
        for (int i =0; i<arr.length; i++){
            ans[i] = arr[i];
        }
        return ans;
    }

    public static boolean equalList(int[] arr1, int[] arr2){
        boolean ans = false;
        for (int i = 0; i < arr1.length;i++) {
            if (arr1[i] == arr2[i]){
                ans= true;
            }else {
                ans= false;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
