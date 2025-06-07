//import java.util.*;
public class largest {
    public static int largestNum(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }
        System.out.println("smallest number : "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={10,5,85,64,95,5};
        System.out.println("largest number :"+largestNum(arr));
    }
}
