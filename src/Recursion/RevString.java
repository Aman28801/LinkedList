package Recursion;

public class RevString {
    public static void printrev(String str,int index){
        if(index==0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print(str.charAt(index));
        printrev(str,index-1);
    }
    public static void main(String[] args) {
        String str="abcd";
        printrev(str,str.length()-1);


    }
}
