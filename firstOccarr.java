public class firstOccarr {
    public static int printOccArr(int arr[],int k,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==k){
            return i;
        }
        return printOccArr(arr, k, i+1);
    }
    public static void main(String[] args) {
        int arr[]={10,5,6,8,41,5,9,10,6};
        System.out.println(printOccArr(arr, 7, 0));
    }
}
