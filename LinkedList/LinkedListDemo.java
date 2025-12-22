//  ARRAY TO LINKED LIST
class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListDemo {

    // Convert Array to Linked List
    public static Node convertArrToLL(int[] arr) {
        if (arr.length == 0) {
            return null;
        }

        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }
    private static int lengthOfLL(Node head){
        int count=0;
        Node temp =head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
        
    }

      public static int checkIfPresent(Node head,int val){
        Node temp=head;
        while(temp!=null){
            if(temp.data==val)return 1;
            temp =temp.next;
        }
        return 0;

    }



    // Print Linked List
    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 6, 8};

        Node head = convertArrToLL(arr);
        printLL(head);

        //traversal
        // Node temp=head;
        // while(temp!=null){
        //     System.out.println(temp.data+" ");
        //     temp=temp.next;
        // }


        // length of LinkedList
        //System.out.print(lengthOfLL(head));

        //searching in LinkedList
        System.out.println(checkIfPresent(head,5));
    }
}
