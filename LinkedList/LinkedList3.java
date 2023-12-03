
public class LinkedList3 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // Step-1 Create new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step-2 newNode next= head
        newNode.next = head;
        // Step-3 head=newNode
        head = newNode;
    }

    public void print() {
        if (head == null) { 
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null ");
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node h1, Node h2){
        Node mergeLL= new Node(-1);
        Node temp = mergeLL;

        while(h1 != null && h2 != null){
            if(h1.data <= h2.data){
                temp.next = h1;
                h1= h1.next;
                temp = temp.next;
            }else{
                temp.next = h2;
                h2=h2.next;
                temp= temp.next;
            }
        }
        while( h1 != null){
            temp.next = h1;
            h1=h1.next;
            temp = temp.next;
        }
        while(h2 != null){
            temp.next = h2;
            h2=h2.next;
            temp= temp.next;
        }
        return mergeLL.next;
    }

    public Node ms(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //find mid
        Node mid = getMid(head);

        //left & right MS
        Node rightHead=mid.next;
        mid.next = null;

        Node newLeft = ms(head);
        Node newRight = ms(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    public void zigzag(){
        //mid
        Node middle = getMid(head);

        //reverse 2nd half       
        Node curr = middle.next;
        middle.next=null;
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next= prev;
            prev = curr;
            curr=next;
        }

        // alternative merge
        Node LH = head;
        Node RH =prev; 
        Node nextL;
        Node nextR;
        while(LH !=null && RH != null){
            nextL=LH.next;
            LH.next = RH;
            nextR = RH.next;
            RH.next = nextL;

            RH = nextR;
            LH = nextL;
        }

    }

        public static void main(String[] args) {
            LinkedList3 ll3 = new LinkedList3();
            ll3.addFirst(1);
            ll3.addFirst(2);
            ll3.addFirst(3);
            ll3.addFirst(4);
            ll3.addFirst(5);
            ll3.print();
            ll3.head = ll3.ms(ll3.head);
            ll3.print();
            ll3.zigzag();
            ll3.print();
    }
}
