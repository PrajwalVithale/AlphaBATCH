public class Pairs {
    public static void pairsArr(int num[]){
        int tn=0;
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+num[i]+","+num[j]+")");
                tn++;
            }
            System.out.println();
        }
        System.out.println("Numbers of pairs are: "+tn);
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        pairsArr(arr);
    }
}
