public class QueueBasic {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        // static int arr[];
        // static int size;
        // static int rear;

        // Queue(int n) {
        // arr = new int[n];
        // size = n;
        // rear = -1;
        // }

        // public static boolean isEmpty(){
        // return rear== -1;
        // }

        // //add O(1)
        // public static void add(int data){
        // if(rear == size-1){
        // System.out.println("Queue is full");
        // return;
        // }
        // rear++;
        // arr[rear]=data;
        // }

        // //remove O(n)
        // public static int remove(){
        // int front = arr[0];
        // for(int i=0; i<rear; i++){
        // arr[i]=arr[i+1];
        // }
        // rear--;
        // return front;
        // }

        // //peek
        // public static int peek(){
        // int peek=arr[0];
        // return peek;
        // }

        // //print
        // public static void printQueue(){
        // for(int i=0; i<=rear; i++){
        // System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        // }

        // =====================================circulerQueue=====================================================

        // static int front = -1;

        // public static boolean isEmpty() {
        // return (rear == -1 && front == -1);
        // }

        // public static boolean isFull() {
        // return (rear + 1) % size == front;
        // }

        // // add O(1)
        // public static void add(int data) {
        // if (isFull()) {
        // System.out.println("Queue is full");
        // return;
        // }
        // // add 1st element
        // if (front == -1) {
        // front = 0;
        // }
        // rear = (rear + 1) % size;
        // arr[rear] = data;
        // }

        // // remove O(1)
        // public static int remove() {
        // int result = arr[front];
        // // last element delete
        // if (rear == front) {
        // rear = front = -1;
        // } else {
        // front = (front + 1) % size;
        // }
        // return result;
        // }

        // // peek
        // public static int peek() {
        // if (isEmpty()) {
        // System.out.println("Queue is Empty");
        // return -1;
        // }
        // return arr[front];
        // }

        // ===================usingLinkedList============================================

        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return (head == null && tail == null);
        }

        // add
        public static void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            int front = head.data;
            // single element
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}