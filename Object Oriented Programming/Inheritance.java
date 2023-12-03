public class Inheritance {
    public static void main(String[] args) {
        // Fish shark= new Fish();
        // shark.eat(); // Single Inheritance
        Dog dogy=new Dog();//Multi Inheritance
        dogy.eat();
        dogy.legs=4;
        System.out.println(dogy.legs);
        dogy.breed= "lab";
        System.out.println(dogy.breed);
    }
}
       //Base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breaths");
    }
}
        //Derive Class
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swims in water");
//     }
// }
class Mammals extends Animal{
    int legs;

}
class Dog extends Mammals{
    String breed;
}
