package HeapsAndHashing;

import java.util.PriorityQueue;

public class KNearestCars {
    static class Points implements Comparable<Points>{
        int x;
        int y;
        int Distsq;
        int i;
        public Points( int x,int y,int Distsq,int i){
            this.x=x;
            this.y=y;
            this.Distsq=Distsq;
            this.i=i;
        }

        @Override
        public int compareTo(Points p2){
            return this.Distsq-p2.Distsq;
        }
    }
    public static void main(String[] args) {
        int arr[][]={{3,3},{5,-1},{-2,4}};
        int k=2;

        PriorityQueue<Points> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            int Distsq=arr[i][0]*arr[i][0] + arr[i][1]*arr[i][1];
            pq.add(new Points(arr[i][0], arr[i][1], Distsq, i));
        }

        for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().i);
        }
    }
}
