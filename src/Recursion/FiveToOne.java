package Recursion;

public class FiveToOne {
    public static void Series(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        Series(n-1);

    }
    public static void main(String[] args) {
        int n=5;
        Series(n);

    }
}
