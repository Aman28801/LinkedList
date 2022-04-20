package BinaryTree;

import java.util.Scanner;

public class BinaryTreeByArray {
    int[] arr;
    int lastusedindex;

    public BinaryTreeByArray(int size){
        arr=new int[size+1];
        lastusedindex=0;

    }
    public void insert(int value){
        if(arr.length-1==lastusedindex){
            System.out.println("Array IS Full");
        }
        else{
            arr[lastusedindex+1]=value;
            lastusedindex++;
        }
        //PRe Order Traversal
    }
    public void  PreOrderTraverse(int index){
        if(index>lastusedindex){
            return;
        }
        System.out.println(arr[index]);
        PreOrderTraverse(index*2);
        PreOrderTraverse(index*2+1);
    }

    public static void main(String[] args) {
        BinaryTreeByArray b=new BinaryTreeByArray(6);
        Scanner sc =new Scanner(System.in);
        System.out.println("1.Insert");
        System.out.println("2.Traverse");
        System.out.println("Choose");
        int i=sc.nextInt();
        switch (i){
            case 1:
                System.out.println("Enter Value");
                int n=sc.nextInt();
                b.insert(n);
                break;
            case 2:
                b.PreOrderTraverse(1);
                break;
        }
    }

}
