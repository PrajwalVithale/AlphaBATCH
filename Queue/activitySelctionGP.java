package Queue;
import java.util.*;

public class activitySelctionGP {
    public static void main(String[] args) {
        int st[]={0,1,3,5,5,8};
        int et[]={6,2,4,7,9,9};

        // int maxActivity=0;
        // ArrayList<Integer> al=new ArrayList<>();
 
        // maxActivity=1;
        // al.add(0);
        // int lastEnd=et[0];

        // for(int i=0;i<et.length;i++){
        //     if(st[i]>=lastEnd){
        //         maxActivity++;
        //         al.add(i);
        //         lastEnd=et[i];
        //     }
        // }

        //if ending time is not in Sorted form then 
        int activities[][]=new int[st.length][3];
        for(int i=0;i<st.length;i++){
            activities[i][0]=i;
            activities[i][1]=st[i];
            activities[i][2]=et[i];
        }

        //sorting of activities
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));

        int maxActivity=0;
        ArrayList<Integer> al=new ArrayList<>();

        maxActivity=1;
        al.add(activities[0][0]);
        int lastEnd=activities[0][2];

        for(int i=0;i<et.length;i++){
            if(activities[i][1]>=lastEnd){
                maxActivity++;
                al.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }
        System.out.println("Max Activities = "+maxActivity);

        for(int i=0;i<al.size();i++){
            System.out.print("A"+al.get(i)+" ");
        }
        System.out.println();
    }

}
