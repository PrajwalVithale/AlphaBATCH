package BackTracking;

public class gridwaysproblem {

        public static int gridways(int i,int j,int n,int m){
            if(i==n-1&&j==m-1){
                return 1;


            }
            else if(i==n ||  j==m){
                return 0;
            }

            int ways1=gridways(i+1, j, n, m);
            int ways2=gridways(i, j+1, n, m);

            return ways1+ways2;
        }
    public static void main(String[] args) {
        int n=4,m=4;
        System.out.println(gridways(0,0,n,m));
    }
}
