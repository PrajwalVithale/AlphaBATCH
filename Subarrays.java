public class Subarrays{
    public static void subArrays(int arr[]){
        int tn=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int ts=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    ts+=arr[k];
                }
                tn++;
                System.out.println();
                System.out.println("sum subarrays = "+ts);
            }
            System.out.println();
        }
        System.out.println("Total number of subarrays = "+tn);
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12};
        subArrays(arr);
    }
}