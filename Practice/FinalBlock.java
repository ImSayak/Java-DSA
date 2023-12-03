import javax.swing.plaf.synth.SynthStyleFactory;

public class FinalBlock {
    public static void main(String[] args) {
        int a=5, b=5;
        try{
            int d= a/b;
            System.out.println(d);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("My Name is Sayak");
        }
        System.out.println("Hi");
    }
}
