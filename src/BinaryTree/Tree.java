package BinaryTree;

import java.util.Scanner;

import static BinaryTree.Tree.Node.*;

public class Tree {
    static class Node {
        int data;
        Node left;
        Node right;
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
        Scanner sc=new Scanner(System.in);
        Node root = CreateTree();
        InOrder(root);
        System.out.println();
        PreOrder(root);
        System.out.println();
        PostOrder(root);

    }
}
