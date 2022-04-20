package Recursion;

public class HanoiProblem {
    public static void tower(int n,String Source,String Helper,String Destination){
        if(n==1){
            System.out.println("transferred"+n+"from"+Source+"to"+Destination);
            return;
        }
        tower(n-1, Source, Destination, Helper );
        System.out.println("transferred"+n+"from"+Source+"to"+Destination);
        tower(n-1, Helper, Source, Destination);
    }
    public static void main(String[] args) {
        int n = 5;
        tower(n,"S","H","D");

    }
}
