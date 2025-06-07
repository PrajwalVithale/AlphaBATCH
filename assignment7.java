public class assignment7 {

    //1
    public static int Countno(int arr[][]){
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        return count;
    }

    //2
    public static int SumOF2ndRow(int arr[][]) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==1 && j<arr.length){
                    sum+=arr[i][j];
                }
            }
        }
        return sum;
    }

    //3
    public static int[][] Transpose(int arr[][]){
       int row=2,column=3;
       int[][] Transpose=new int[column][row];
       for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                Transpose[j][i]=arr[i][j];
            }
       }
       return Transpose;
    }

    public static void printMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //int[][] arr={ {4,7,8},{8,8,7}};
        //System.out.println(Countno(arr));

        //int[][] arr= {{1,4,9},{11,4,9},{2,2,3} };
        //System.out.println(SumOF2ndRow(arr));
        
        int[][]matrix= { {2,3,7}, {5,6,7} };
        printMatrix(Transpose(matrix));
        
    }
}
