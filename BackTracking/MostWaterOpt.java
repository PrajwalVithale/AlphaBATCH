package BackTracking;

import java.util.ArrayList;
//2 pointer approach
//O(n)
public class MostWaterOpt{

    public static int WaterStored(ArrayList<Integer> height){
        int maxwater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int wd=rp-lp;
            //currentWater
            int currentWater=ht*wd;
            maxwater=Math.max(maxwater,currentWater);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(WaterStored(height));
    }
}