public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);
        

        Chicken c= new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);


        //Animal a= new Animal(); //This is not valid
        //we can't creat an object in Abstract class
        //but we can create contructor
        
    }
}
abstract class Animal{
    String color;
    Animal(){//but we can create contructor
        color="Brown";
    }
    void eat(){
        System.out.println("animals eats");
    }
    abstract void walk();
}
class Horse extends Animal {
    void changeColor(){
        color="Black";
    }
    void walk(){
        System.out.println("walk on 4 legs");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color="White";
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
}