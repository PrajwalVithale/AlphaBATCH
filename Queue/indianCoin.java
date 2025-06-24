package Queue;
import java.util.*;

public class indianCoin {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());

        int coinsReq=0;
        int amount=59050;

        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    coinsReq++;
                    ans.add(coins[i]);
                    amount=amount-coins[i];
                }
            }
        }
        System.out.println("Coins Required are = "+coinsReq);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
    }
}
