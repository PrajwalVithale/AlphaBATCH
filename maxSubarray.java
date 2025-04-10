public class maxSubarray{
    public static void subArrays(int arr[]){
        int current=0;
        int Maxnum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                current=0;
                for(int k=i;k<=j;k++){
                    current+=arr[k];
                }
                System.out.println(current);
                if(Maxnum<current){
                    Maxnum=current;
                }
            }
        }
        System.out.println("Max sum of subarrays = "+Maxnum);
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12};
        subArrays(arr);
    }
}