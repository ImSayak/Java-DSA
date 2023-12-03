public class InterChange {
    public static void main(String[] args) {
        number n=new number(3,9);
        n.interchange();
    }

}
class number{
    int a,b;
    number(int x, int y){
        this.a=x;
        this.b=y;
    }
    void interchange(){
        this.a= this.a+this.b;
        this.b= this.a-this.b;
        this.a= this.a-this.b;
        System.out.println("x= "+a+" y= "+b);
    }
}
