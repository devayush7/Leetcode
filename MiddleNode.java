
public class MiddleNode {
    public static Node middleNode(Node head) {
        Node fast =head;
        Node slow =head;
        if(head==null){
            return head;
        }
    
        while(fast!=null && fast.next!=null){
            
            fast=fast.next.next;
            slow=slow.next; 
        }
        return slow;
    }
}
class Node {

    static Node head;
    //Definition for singly-linked list.
    int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node next) { this.val = val; this.next = next; }

    static void insert(int data){ //inserting values in the begining of linked list
        Node newNode = new Node(data);

        if(head==null){
            head=newNode; 
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    static void display(Node head){ // printing the all the values of linkedlist
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(1);
        insert(1);
        display(head);
        
        Node result=MiddleNode.middleNode(head);
        display(result);
 
    }
}