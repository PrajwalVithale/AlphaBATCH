public class lastOccur {

    public static int lastOccurarr(int arr[],int k,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOccurarr(arr, k, i+1);
        if(isFound==-1 && arr[i]==k){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[]={10,5,6,8,41,5,9,10,6};
        System.out.println(lastOccurarr(arr, 11, 0));
    }
}
