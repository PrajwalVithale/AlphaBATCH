public class patternadvance {

    public static void hollow_rectange(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid(int n,int m){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramidNum(int n,int m){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            for(int j=1;j<n+i+1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void floidsTriangle(int x){
        int c=1;
        for(int i=1;i<=x;i++){
           for(int j=1;j<=i;j++){
            System.out.print(c+" ");
            c++;
           }
           System.out.println();
        }
    }

    public static void triangle0_1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){
        for(int i=1;i<=n;i++){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            //star
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            //space
            for(int j=2*(n-i);j>=1;j--){
                System.out.print("  ");
            }
            //star
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        //1st half
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //2nd half
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //hollow_rectange(4, 5);
        //invertedHalfPyramid(4, 5);
        //invertedHalfPyramidNum(5, 5);
        //floidsTriangle(6);
        //triangle0_1(5);
        //butterfly(5);
        //rhombus(6);
        //hollowRhombus(8);
        diamond(8);
    }
}
