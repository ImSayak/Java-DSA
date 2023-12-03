public class LinkedList {
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

    public void addLast(int data) {
        // Step-1 Create new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step-2 tail next = newNode
        tail.next = newNode;
        // Step-3 tail=newNode
        tail = newNode;
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

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        // i=idx-1; temp--> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("Empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val =head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev= head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public int itrSearch(int key){
        int i=0;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){//key found
                return i;
            }
            temp=temp.next;
            i++;
        }
        //key not found
        return -1;
    }
    
    public int helper(Node head, int key){
        //base case
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx== -1){
            return -1;
        }
        return idx+1;
    }
    
    public int recSearch(int key){
        return helper(head, key);
        
    }
    
    public void reverse(){
        Node prev = null;
        Node curr= tail = head;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head=prev;
    }

    public void deleteNthformEnd(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }

        if(n == sz){
            head=head.next;//remove First
            return;
        }

        //sz-n
        int i=1;
        int itoFind=sz-n;
        Node prev= head;
        while(i<itoFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
    }
    //slow-fast approach
    public Node findMid(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;//slow is my midNode
    }

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        //step-1 find mid
        Node midNode=findMid(head);


        //step-2 reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;//right half head
        Node left = head;

        //step-3 check left-half & right-half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }



    // private Node getMid(Node head){
    //     Node slow = head;
    //     Node fast = head.next;

    //     while(fast != null && fast.next != null){
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     return slow;
    // }

    // private Node merge(Node h1, Node h2){
    //     Node mergeLL= new Node(-1);
    //     Node temp = mergeLL;

    //     while(h1 != null && h2 != null){
    //         if(h1.data <= h2.data){
    //             temp.next = h1;
    //             h1= h1.next;
    //             temp = temp.next;
    //         }else{
    //             temp.next = h2;
    //             h2=h2.next;
    //             temp= temp.next;
    //         }
    //     }
    //     while( h1 != null){
    //         temp.next = h1;
    //         h1=h1.next;
    //         temp = temp.next;
    //     }
    //     while(h2 != null){
    //         temp.next = h2;
    //         h2=h2.next;
    //         temp= temp.next;
    //     }
    //     return mergeLL.next;
    // }

    // public Node ms(Node head){
    //     if(head == null || head.next == null){
    //         return head;
    //     }
    //     //find mid
    //     Node mid = getMid(head);

    //     //left & right MS
    //     Node rightHead=mid.next;
    //     mid.next = null;

    //     Node newLeft = ms(head);
    //     Node newRight = ms(rightHead);

    //     //merge
    //     return merge(newLeft, newRight);
    // }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addLast(7);
        // ll.print();
        ll.addLast(3);
        // ll.print();
        ll.add(2, 9);
        // ll.print();
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.itrSearch(9));
        // System.out.println(ll.recSearch(3));
        // ll.reverse();
        // ll.print();
        // ll.deleteNthformEnd(2);
        ll.print();
        // System.out.println(ll.checkPalindrome());
        // System.out.println(ll.size);
        // ll.head = ll.ms(ll.head);
        ll.print();
    }
}