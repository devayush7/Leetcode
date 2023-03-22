public class LinkedList {

        static Node head;
        
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
            }
        }

        static void insert(int data){
                Node newNode = new Node(data);

                if(head == null){
                    head = newNode;
                }else{
                    newNode.next = head;
                    head=newNode;
                }
        }

        static void display(Node head){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println();
        }

        static Node reverse(Node node){
            Node prev = null;
            Node current = node;
            Node next = null;
            while(current!=null){
                next=current.next;
                current.next=prev;
                prev=current;
                current=next;
            }
            node=prev;
            return node;

        }
    
        public static void main(String[] args) {
            insert(0);
            insert(1);
            insert(5);
            insert(6);
            display(head);
            Node a=reverse(head);
            display(a);
        }
}
