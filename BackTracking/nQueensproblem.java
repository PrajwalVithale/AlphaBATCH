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

    public static void nqueens(char boards[][],int row){
        if(row==boards.length){
            printborard(boards);
            return;
        }
        for(int j=0;j<boards.length;j++){
            if(isSafe(boards,row,j)){
                boards[row][j]='Q';
                nqueens(boards, row+1);
                boards[row][j]='X';
            }   
        }
    }

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
        int n=6;
        char board[][]=new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }

        nqueens(board,0);
    }
}
