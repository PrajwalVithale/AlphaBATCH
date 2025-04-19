import java.util.Arrays;

public class inbuiltarray {
    public static void main(String[] args) {
        int arr[]={10,50,40,30,60,20};
        Arrays.sort(arr);
        System.out.println("new sorted array is: ");
        for (int i=0;i<arr.length-1;i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
