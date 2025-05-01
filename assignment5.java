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

    //3
    public static int maxprofit(int prices[]){
        int buy=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<prices.length;i++){
            if(buy<prices[i]){
                int profit=prices[i]-buy;
                max=Math.max(max, profit);
            }
            else{
                buy=prices[i];
            }
        }
        return max;
    }

    //4
    public static int maxWater(int arr[]){
        int n=arr.length;
        int leftamx[]=new int[n];
        leftamx[0]=arr[0];
        for(int i=1;i<n;i++){
            leftamx[i]=Math.max(leftamx[i-1], arr[i]);
        }

        int rightmax[]=new int[n];
        rightmax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1], arr[i]);
        }

        int trapwater=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftamx[i], rightmax[i]);
            trapwater+=waterLevel-arr[i];
        }

        return trapwater;
    }

    //5
    public static void triplets(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=j;k<arr.length;k++){
                    if(arr[i]!=arr[j] && arr[j]!=arr[k]){
                        if((arr[i]+arr[j]+arr[k])==0){
                            System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 0,  1, 2, -1, -4};
        // System.out.println(containsDuplicate(arr));
        //System.out.println(searchElement(arr, 9));
        //System.out.println(maxprofit(arr));
        //System.out.println(maxWater(arr));
        triplets(arr);
    }
}
