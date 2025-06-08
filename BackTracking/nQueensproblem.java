package BackTracking;

public class nQueensproblem {

    public static boolean isSafe(char boards[][],int row,int col){
        for(int i=row-1;i>=0;i--){
            if(boards[i][col]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(boards[i][j]=='Q'){
                return false;
            }
        }

        for(int i=row-1,j=col+1;i>=0&&j<boards.length;i--,j++){
             if(boards[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

    public static boolean nqueens(char boards[][],int row){
      
        if(row==boards.length){
            count++;
            //printborard(boards);
            return true;
        }
        
        for(int j=0;j<boards.length;j++){
            if(isSafe(boards,row,j)){
                boards[row][j]='Q';
                if(nqueens(boards, row+1)){
                    return true;
                }
                boards[row][j]='X';
            }   
        }
        return false;
        
    }

    public static int count=0;

    public static void printborard(char boards[][]){
        System.out.println("---------------CHESS BOARD-------------------");
        for(int i=0;i<boards.length;i++){
            for(int j=0;j<boards.length;j++){
                System.out.print(boards[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        char board[][]=new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }

        if(nqueens(board,0)){
            System.out.println("SOlution is ppossible");
            printborard(board);
        }else{
            System.out.println("Solution is not possible");
        }
        //System.out.println("Total Number of Ways Queens can be Keep is: "+count);
        
    }
}
