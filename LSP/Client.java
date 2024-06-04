package LSP;

import LSP.Following.Bird;
import LSP.Following.Eagle;
import LSP.Following.Flyable;
import LSP.Following.Penguin;

public class Client {

    public static void main(String[] args) {
        Bird eagle= new Eagle();
        eagle.eat();
        ((Flyable)eagle).fly();
        Flyable eaglefly= new Eagle();
        eaglefly.fly();
        Bird penguin= new Penguin();
        penguin.eat();
    }
}
