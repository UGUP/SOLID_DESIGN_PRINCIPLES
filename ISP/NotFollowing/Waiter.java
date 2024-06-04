package ISP.NotFollowing;

public class Waiter implements RestrauntEmployee{
    private boolean orderTaken;
    private boolean orderDelivered;
    private int orderId;

    @Override
    public void takeOrder() {
        System.out.println(" order taken");
    }

    @Override
    public void washDishes() {
    throw new IllegalArgumentException(" i dont wash dishes");
    }

    @Override
    public void serveCustomers() {
        System.out.println(" order served ");
    }

    @Override
    public void cookFood() {
        throw new IllegalArgumentException(" i dont cook food");
    }
}
