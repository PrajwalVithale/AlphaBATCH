public class Trappedwater {

    public static int trappedWater(int h[]){
        int n=h.length;

        int trappedwater=0;
        //Left max boundry array
        int leftmax[]=new int[n];
        leftmax[0]=h[0];
        for(int i=1;i<n;i++){
            leftmax[i]=Math.max(leftmax[i-1],h[i]);
        }
        //right max boundry array
        int rightmax[]=new int[n];
        rightmax[n-1]=h[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(rightmax[i+1],h[i]);
        }

        for(int i=0;i<n;i++){
            //calculating waterlevel
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            //calculating trapped waterlevel
            trappedwater+=waterlevel-h[i];
        }
        return trappedwater;
    }

    public static void main(String[] args){
        int arr[]={4,2,0,6,3,2,5};
        System.out.println(trappedWater(arr));
    }
}