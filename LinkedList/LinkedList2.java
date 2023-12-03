public class LinkedList2 {
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    

    public void addLast(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;   
    }

    public void print(){
        if(head==null){
            System.out.println("LinkedLisdt is Empty");
            return;
        }
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }


    public static boolean isCycle(){ // Floye's CFA
        Node slow=head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
            if(slow == fast){//cycle exist
                return true;
            }
        }
        return false;
    }

    public void removeCycle(){
        //detect cycle
        Node slow=head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast =fast.next.next;

            if(slow == fast){
                cycle= true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        //finding meeting point
        slow = head;
        Node prev = null;//last node
        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle -> last.next = null
        prev.next = null;
    }

    public static void main(String[] args) {
        LinkedList2 ll2 = new LinkedList2();
        // ll2.addLast(1);
        // ll2.addLast(2);
        // ll2.addLast(3);
        // ll2.addLast(4);
        // ll2.addLast(5);
        // ll2.print();
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next=new Node(4);
        head.next.next.next=new Node(5);
        head.next.next.next=head.next.next;
        System.out.println(isCycle());
        ll2.removeCycle();
        System.out.println(isCycle());
    }
}
