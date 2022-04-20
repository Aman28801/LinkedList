import java.util.Scanner;
class Node{
    int rollno;
    Node next;
}
public class SinglyLinkedList {
    Node HEAD;
    SinglyLinkedList(){
        HEAD = null;
    }
    void insert(){
        System.out.println("Enter your roll no.: ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node temp = new Node();
        temp.rollno = data;
        temp.next = null;
        if(HEAD == null){
            HEAD = temp;
        }
        else{
            Node current = HEAD;
            while(current.next != null){
                current = current.next;
            }
            current.next = temp;
        }
        System.out.println("Node Inserted...");
    }
    void delete(){
        System.out.println("Delete fn is working successfully.");
        if (HEAD == null){
            System.out.println("List Empty");
        }
        else{
            System.out.println("Deleted..." + HEAD.rollno);
            if(HEAD.next == null){
                HEAD = null;
            }
            else{
                HEAD = HEAD.next;
            }
        }
    }
    void traverse(){
        System.out.println("Transverse fn is working successfully.");
        if(HEAD == null){
            System.out.println("List Empty");
        }
        else{
            System.out.println("---Singly list elements---");
            Node current;
            for(current = HEAD; current != null; current = current.next){
                System.out.println(" " +current.rollno);
            }
        }
    }
    public static void main(String...gs){
        SinglyLinkedList obj = new SinglyLinkedList();
        while(true){
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for transverse");
            System.out.println("Press 4 for Exit");
            System.out.println("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> obj.insert();
                case 2 -> obj.delete();
                case 3 -> obj.traverse();
                case 4 -> System.exit(0);
                default -> System.out.println("Wrong Choice.");
            }
        }
    }
}