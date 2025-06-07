public class maxSubarrayKadan{
    public static void subArrays(int arr[]){
        int current=0;
        int Maxnum=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            current=current+arr[i];
            if(current<0){
                current=0;
            }
            Maxnum=Math.max(current, Maxnum);
        }
        System.out.println("Max sum of subarrays = "+Maxnum);
    }

    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        subArrays(arr);
    }
}