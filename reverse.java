public class reverse {
    public static void reverseArr(int arr[]){
        int f=0;
        int l=arr.length-1;
        while(f<l){
            int temp=arr[l];
            arr[l]=arr[f];
            arr[f]=temp;
            f++;
            l--;
            //System.out.println(arr+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        reverseArr(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
