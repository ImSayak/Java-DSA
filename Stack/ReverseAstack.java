import java.util.*;

public class ReverseAstack {
    public static void pushInBottom(Stack<Integer>s, int n){
        if(s.isEmpty()){
            s.push(n);
            return;
        }
        int top = s.pop();
        pushInBottom(s, n);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushInBottom(s,top);
    }

    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //3 2 1
        reverseStack(s);
        //1 2 3
        printStack(s);
    }
}
