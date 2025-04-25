public class assignment5 {

    // 1
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // 2
    public static int searchElement(int arr[],int k){
        int start=0;
        int last=arr.length-1;
        while (start<=last) {
            int mid=(start+last)/2;
            if(k==arr[mid]){
                //System.out.println("Key found at index "+mid);
                //break;
                return mid;
            }
            if(k<arr[mid]){
                last=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 7, 9, 37 };
        // System.out.println(containsDuplicate(arr));
        System.out.println(searchElement(arr, 9));

    }
}
