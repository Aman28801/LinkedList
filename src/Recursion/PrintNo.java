package Recursion;

public class PrintNo {
    public static void Series(int N){
        if(N==0){
            System.out.println(N);
            return;
        }
        System.out.println(N);
        N++;
        Series(N);
    }

    public static void main(String[] args) {
        int N=10;
        Series(N);
    }
}
