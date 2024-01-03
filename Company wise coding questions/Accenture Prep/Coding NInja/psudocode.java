
public class psudocode {
public static void main(String[] args) {
    int a=7,b=3,c=4;
    b=a+a+a;
    for(c=5;c<=7;c++){
        a=11^b;
    }
    System.out.println(c);
    a=(c&1)&b;
    System.out.println(a+b);
}
    
}