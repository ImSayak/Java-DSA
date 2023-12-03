public class Thrws {
 static void fun() throws IllegalAccessException{
    System.out.println("Inside fun()");
    throw new IllegalAccessException("Demo");
  }  
  public static void main(String[] args) {
    try{
        fun();
    }
    catch(IllegalAccessException e){
        System.out.println("Caugth in main");
    }
  } 
}
