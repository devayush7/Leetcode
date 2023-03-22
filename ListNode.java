import java.util.List;

class Solution {
    public static boolean isPalindrome(ListNode head,ListNode node) { //check both Linked list for palindrome
        ListNode temp1 = head;
        ListNode temp2 = node;
        System.out.println(temp1.next);
        System.out.println(temp2.next);
        while((temp1!=null) && (temp2!=null)){
            if(temp1.val==temp2.val){ //comparing the values
                System.out.println("running");
                temp1=temp1.next;
                temp2=temp2.next;
                continue;
            }else{
                return false;
            }
            
        }
        return true;
    }
   
}
public class ListNode {

    static ListNode head;
    //Definition for singly-linked list.
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    static void insert(int data){ //inserting values in the begining of linked list
        ListNode newNode = new ListNode(data);

        if(head==null){
            head=newNode; 
        }else{
            newNode.next=head;
            head=newNode;
        }
    }

    static void display(ListNode head){ // printing the all the values of linkedlist
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println();
    }

    static ListNode reverse(ListNode node){ //reversing the linked list
        ListNode t = node;
        ListNode prev = null;
        ListNode current = t;
        ListNode next = null;
        while(current!=null){
            next = current.next;
            current.next=prev;
            prev = current;
            current = next;
        }
        t=prev;
        return t; // returns a reversed linked list
    }

    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(1);
        insert(1);
        //display(head);
        ListNode n = reverse(head);
        //display(n);
        boolean result=Solution.isPalindrome(head,n);
        System.out.println(result);
 
    }
}