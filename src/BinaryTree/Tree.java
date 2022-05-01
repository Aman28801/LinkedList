package BinaryTree;

import java.util.Scanner;

import static BinaryTree.Tree.Node.*;

public class Tree {
    static class Node {
        int data;
        Node left;
        Node right;
        private Node root;

        public Node(int data) {
            this.data = data;
        }

        static Node CreateTree() {
            Node root =null;
            System.out.println("Enter Data: ");
            Scanner sc=new Scanner(System.in);
            int data = sc.nextInt();
            if (data == -1){
                return null;
            }
            root = new Node(data);
            System.out.println("Enter left data" + " ");
            root.left = CreateTree();
            System.out.println("Enter right data" + " ");
            root.right = CreateTree();
            return root;
        }

        static void InOrder(Node root){
            if(root == null) return;
            InOrder(root.left);
            System.out.print(root.data+" ");
            InOrder(root.right);
        }
        static void PreOrder(Node root){
            if(root==null) return;
            System.out.print(root.data+" ");
            PreOrder(root.left);
            PreOrder(root.right);
        }
        static void PostOrder(Node root){
            if(root==null) return;
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data+" ");
        }
    }
    public static void main(String[] args) {

//        Scanner sc=new Scanner(System.in);
//        System.out.println("Choice");
//        System.out.println("1. Create Tree");
//        System.out.println("2. Traverse Your Tree");
//        System.out.println("3. Find Any Element");
//        int Choice =sc.nextInt();
//        switch(Choice){
//            case 1:
                Node root =CreateTree();
//                System.out.println("Tree Created");
//                return;
//                break;
//            case 2:
//                System.out.println("What type of Traverse You Want");
//                System.out.println("1.InOrder");
//                System.out.println("2.PostOrder");
//                System.out.println("3.PreOrder");
//                int b =sc.nextInt();
//                switch (b) {
//                    case 1 -> InOrder();
//                    case 2 -> PostOrder();
//                    case 3 -> PreOrder();
//                }
//            case 3:
//                System.out.println("Which Element");
               // find(20);
//                int c=sc.nextInt();
//                break;
//        }
    }
}
