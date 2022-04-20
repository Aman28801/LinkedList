package Recursion;

import java.util.Calendar;

public class Power {
    public static int CaclPower(int x,int n){
        if(n==0){
            return 1;   //base case 1
        }
        if(x==0){
            return 0;  //base case 2
        }
        if(n%2==0)
        {
            return CaclPower(x,n/2)*CaclPower(x,n/2);
        }
        else
        {
            return CaclPower(x,n/2)*CaclPower(x,n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x=2;
        int n=4;
        int ans = CaclPower(x,n);
        System.out.println(ans);

    }
}

