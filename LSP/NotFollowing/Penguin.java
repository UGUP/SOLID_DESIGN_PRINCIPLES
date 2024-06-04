package LSP.NotFollowing;

public class Penguin extends Bird{
    @Override
    public void eat() {
        System.out.println(" Penguin is eating");
    }

    @Override
    public void fly() {
       throw new IllegalArgumentException(" penguin cannot fly");
    }
}
