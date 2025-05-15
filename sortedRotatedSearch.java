// public class sortedRotatedSearch {
//     public static int search(int arr[],int tar,int si,int ei){
//         if(si>ei){
//             return -1;
//         }

//         int mid=si+(ei-si)/2;
//         if(arr[mid]==tar){
//             return mid;
//         }

//         if(arr[si]<=arr[mid]){
//             if(arr[si] <= tar && tar <=arr[mid]){
//                 return search(arr, tar, si, mid-1);
//             }else{
//                 return search(arr, tar, mid+1, ei);
//             }
//         }
//         else{
//             if(arr[mid]<=tar && tar<=arr[ei]){
//                 return search(arr, tar, mid+1, ei);
//             }
//             else{
//                 return search(arr, tar, si, mid-1);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int arr[]={4,5,6,7,0,1,2};
//         int tar=6;
//         System.out.println(search(arr, tar, 0, arr.length-1));
//     }
// }


//using loops


public class sortedRotatedSearch {
    public static int search(int arr[],int tar,int si,int ei){
        int i;
        if(si>ei){
            return -1;
        }

        int mid=si+(ei-si)/2;
        if(arr[mid]==tar){
            return mid;
        }

        if(arr[si]<=arr[mid]){
            if(arr[si] <= tar && tar <=arr[mid]){
                for(i=si;i<mid;i++){
                    if(arr[i]==tar){
                        return i;
                    }
                }
            }else{
               for(i=mid;i<ei;i++){
                    if(arr[i]==tar){
                        return i;
                    }
                }
            }
        }
        else{
            if(arr[mid]<=tar && tar<=arr[ei]){
                for(i=mid+1;i<ei;i++){
                    if(arr[i]==tar){
                        return i;
                    }
                }
            }
            else{
                for(i=si;i<mid-1;i++){
                    if(arr[i]==tar){
                        return i;
                    }
                }
            }
        }

        return i;
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int tar=2;
        System.out.println(search(arr, tar, 0, arr.length-1));
    }
}

