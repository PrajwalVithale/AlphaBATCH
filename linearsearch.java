public class linearsearch {
    public static int linearSearch(int arr[],int k){
        for(int i=0;i<arr.length;i++){
            if(k==arr[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70,80,90};
        int key=55;
        int index=linearSearch(arr, key);
        if(index>0){
            System.out.println("key found at index: "+index);
        }
        else{
            System.out.println("Not found!!");
        }
    }
}
