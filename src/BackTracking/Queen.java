package BackTracking;

import java.util.Scanner;

public class Queen {
    static int count = 0;
    public static void QueenPermutation(boolean[] boxes,int qpsf, int tq , String ans){
        if(qpsf==tq){
            count++;
            System.out.println(count + "." + ans);
            return;
        }
        for (int i=0;i<boxes.length;i++){
            if(false == boxes[i]){
                boxes[i]=true;
                QueenPermutation(boxes, qpsf + 1, tq, ans + "q" + qpsf + "b" + i + " ");
                boxes[i]=false;  //BackTracking
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number of Boxes");
        int n= sc.nextInt();
        System.out.println("Enter the no of Queens");
        int m =sc.nextInt();
        QueenPermutation(new boolean[n],0,m,"");
    }
}
