public class assignment9 {

    //2
    public static void Swap(int x, int y){
        System.out.println("before Swapping "+x+" "+y);

        x=x^y;
        y=x^y;
        x=x^y;

        System.out.println("After Swapping "+x+" "+y);

    }

    //3
    public static void Add1(int x){
        System.out.println(-(~x));
    }


    //4
    public static void toUppercase(){
        for(char ch='A';ch<='Z';ch++){
            System.out.print((char)(ch |' '));
        }
    }
    public static void main(String[] args) {
        //1
        //int x=9;
       //System.out.println(x^x);
        int x=10;
        int y=15;
        //Swap(x, y);

        int z=128;
        //Add1(z);

        toUppercase();
    }
}
