package BinaryTree;
import org.w3c.dom.Node;

import javax.swing.text.DefaultEditorKit;
import java.util.Scanner;

public class ThreadedTree {
    static class node{
        String Phone;
        Node left;
        Node right;
        Boolean rightthread;
            node(String Phone) {
            this.Phone = Phone;
            }
        }
    public static void Insert(String str) {
        int phone = Integer.parseInt(str);
        Node n1 = (Node) new node(str);
        System.out.println(phone);
        int[] arr=new int[10];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Insert(str);

    }
}
