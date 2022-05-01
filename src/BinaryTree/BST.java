package BinaryTree;

public class BST {

    private static class Node{
        int data;
        Node left;
        Node right;
    }
    private final Node root;


    public BST(int[] arr){
        this.root=construct(arr,0,arr.length-1);
    }




    private Node construct(int[] arr, int low, int high) {
        if(low>high){
            return null;
        }
        int mid =(low+high)/2;
        Node nn= new Node();
        nn.data=arr[mid];
        nn.left =construct(arr,low,mid-1);
        nn.right =construct(arr,mid+1,high);
        return nn;
    }






    public void display(){
        display(this.root);
    }
    private void display(Node node){
        if(node==null){
            return;
        }
        String str ="";
        if(node.left==null){
            str +=".";
        }
        else{
            str+=node.left.data;
        }
        str+="-->" +node.data +"<--";

        if(node.right==null){
            str +=".";
        }
        else{
            str+=node.right.data;
        }

    }
    public void add(int item){
        add(this.root ,item);
    }
    private void add(Node node, int item) {
        if (item > node.data) {
            if (node.right == null) {
                Node nn = new Node();
                nn.data = item;
                node.right = nn;
            } else {
                add(node.right, item);
            }
        } else {
            if (node.left == null) {
                Node nn = new Node();
                nn.data = item;
                node.left = nn;
            } else {
                add(node.left, item);
            }
        }

    }

    public void remove(int item){
        remove(this.root, null, false, item);
    }

    private void remove(Node node, Node parent, boolean ilc, int item) {
        if(item>node.data){
            remove(node.right,node,false,item);
        }
        else if(item<node.data){
            remove(node.left,node,true,item);
        }
        else{

        }
    }


}

