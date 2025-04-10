public class maxSubarrayPrefixarr{
    public static void subArrays(int arr[]){
        int current=0;
        int Maxnum=0;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                current=0;
                current=i==0?prefix[j]:prefix[j]-prefix[i-1];
                //System.out.println(current);
                if(Maxnum<current){
                    Maxnum=current;
                }
            }
        }
        System.out.println("Max sum of subarrays = "+Maxnum);
    }

    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        subArrays(arr);
    }
}