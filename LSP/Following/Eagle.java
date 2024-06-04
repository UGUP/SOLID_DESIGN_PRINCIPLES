package LSP.Following;

public class Eagle extends Bird implements  Flyable{
    @Override
    public void eat() {
        System.out.println("Eagle is eating");
    }

    @Override
    public void fly() {
        System.out.println(" Eagle is flying");
    }
}
