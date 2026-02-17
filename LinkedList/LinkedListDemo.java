//  ARRAY TO LINKED LIST
//compatible node class
class Node {
    int data;
    Node next;

    // Constructor for normal node
    Node(int data) {
        this.data = data;
        this.next = null;
    }

    // constructor for insertion at head
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
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

    private static int lengthOfLL(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;

    }

    public static int checkIfPresent(Node head, int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val)
                return 1;
            temp = temp.next;
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

    private static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    private static Node removesHead(Node head) {
        if (head == null)
            return head; // removes head
        head = head.next;
        return head;
    }

    private static Node removeTail(Node head) {
        if (head == null || head.next == null)
            return null;
        Node temp = head; // removes tail
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static Node removeK(Node head, int k) {
        if (head == null || head.next == null)
            return head;
        if (k == 1) {

            return head.next;
        }
        int cnt = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            cnt++;
            if (cnt == k) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;

    }

    private static Node removeEl(Node head, int el) {
        if (head == null || head.next == null)
            return head;
        if (head.data == el) {

            return head.next;
        }

        Node temp = head;
        Node prev = null;
        while (temp != null) { // value

            if (temp.data == el) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;

    }

    private static Node insertHead(Node head, int val) {
        return new Node(val, head);
    }

    private static Node insertTail(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    private static Node insertPosition(Node head, int el, int k) {
        if (head == null) {
            if (k == 1)
                return new Node(el);
            else
                return head;
        }
        if (k == 1) {
            return new Node(el, head);

        }
        int cnt = 1;
        Node temp = head;
        while (temp != null) {

            if (cnt == (k - 1)) {
                Node x = new Node(el, temp.next);
                temp.next = x;
                break;
            }
            cnt++;
            temp = temp.next;
        }

        return head;
    }

    private static Node insertBeforeValue(Node head, int el, int val) {
        if (head == null) {
            return null;
        }
        if (head.data == val) {
            return new Node(el, head);
        }

        Node temp = head;
        while (temp.next != null) {

            if (temp.next.data == val) {
                Node x = new Node(el, temp.next);
                temp.next = x;
                break;
            }

            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 5, 6, 8 };

        Node head = convertArrToLL(arr);
        // printLL(head);

        // traversal
        // Node temp=head;
        // while(temp!=null){
        // System.out.println(temp.data+" ");
        // temp=temp.next;
        // }

        // length of LinkedList
        // System.out.print(lengthOfLL(head));

        // searching in LinkedList
        // System.out.println(checkIfPresent(head,5));

        // deletion case
        // head=removesHead(head);
        // head=removeTail(head);
        // head=removeK(head, 3);
        // head=removeEl(head,6);

        // insertion case
        // head=insertHead(head,100);
        // head=insertTail(head,100);
        // head = insertPosition(head, 100, 2);
        head = insertBeforeValue(head, 100, 12);

        print(head);
    }
}
