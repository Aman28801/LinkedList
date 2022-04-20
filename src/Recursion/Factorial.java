package Recursion;
import java.util.*;

public class Factorial {
    public static int factorial(int n){
        if(n==1 || n==0) {
            return 1;
        }
        int fact_nm1=factorial(n-1);
        return n*fact_nm1;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int ans=factorial(n);
        System.out.println(ans);

    }
}
