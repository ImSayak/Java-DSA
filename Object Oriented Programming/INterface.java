import java.security.PublicKey;

public class INterface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Bear b= new Bear();
        b.eatM();
        b.eatV();
    }
}
interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right, left, diagonal(in all 4 direction");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right, left");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right, left,diagonal(in all direction 1 step)");
    }
}
// ***********Multiple Inheritance********
interface Herbivore{
    void eatV();

}
interface Carnivore{
    void eatM();
}

class Bear implements Herbivore, Carnivore{
    public void eatV(){
        System.out.println("Eat Grass");
    }
    public void eatM(){
        System.out.println("Eat Meat");
    }
}