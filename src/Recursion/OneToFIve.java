package Recursion;

public class OneToFIve {
    public static void Series(int n){
        if (n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        Series(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        Series(n);
    }
}
