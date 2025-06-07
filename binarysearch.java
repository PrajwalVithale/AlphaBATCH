public class binarysearch {

    public static int binarySearch(int arr[],int k){
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
        int arr[]={2,4,6,8,9,10,12,14,18};
        int k=18;
        System.out.println("index of key: "+binarySearch(arr,k));
    }
}
