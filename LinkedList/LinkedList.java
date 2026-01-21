class Node{
    int data;
    Node next;

    //constructor
    Node (int data,Node next){
        this.data=data;
        this.next=next;

    }
    Node(int data){
        this.data=data;
        this.next=null;

    }
}
public class LinkedList{
    //convert array to Linked List
    private static Node convertArr2LL(int[]arr){
        if (arr.length==0) return null;

        Node head=new Node(arr[0]);
        Node mover=head;

        for (int i=1;i<arr.length;i++){
            Node temp =new Node(arr[i]);
            mover.next=temp;
            mover=temp;

        }
        return head;


    }


//print Linked List
  private static void print(Node head){
    while(head!=null){
        System.out.print(head.data + " ");
        head=head.next;
    }
    System.out.println();
  }

  //remove head node from linked List

private static Node RemoveHead(Node head) {
    if(head==null) return head;
    head=head.next;
    return head;
    
}


public static void main (String[] args){
    int [] arr={12,5,6,8};
    
    Node head =convertArr2LL(arr);
    head=RemoveHead(head);
    print (head);
}
}