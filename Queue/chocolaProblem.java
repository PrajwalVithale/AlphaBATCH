package Queue;
import java.util.*;

public class chocolaProblem {
    public static void main(String[] args) {
        //int n=4,m=6;
        Integer costver[]={2,1,3,1,4};
        Integer costhor[]={4,1,2};

        Arrays.sort(costver,Collections.reverseOrder());
        Arrays.sort(costhor,Collections.reverseOrder());

        int h=0,v=0;
        int hp=1,vp=1;
        int cost=0;

        while(v<costver.length && h<costhor.length){
            if(costver[v]<=costhor[h]){
                cost+=(costhor[h]*vp);
                hp++;
                h++;
            }else{
                cost+=(costver[v]*hp);
                vp++;
                v++;
            }
        }

        while(h<costhor.length){
            cost+=(costhor[h]*vp);
            hp++;
            h++;
        }

        while (v<costver.length) {
            cost+=(costver[v]*hp);
            vp++;
            v++;
        }

        System.out.println("Cost of Cutting = "+cost);
    }
}
