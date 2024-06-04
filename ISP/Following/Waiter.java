package ISP.Following;

public class Waiter implements WaiterInterface {
    private boolean orderTaken;
    private boolean orderDelivered;
    private int orderId;

    @Override
    public void takeOrder() {
        System.out.println(" order taken");
    }



    @Override
    public void serveCustomers() {
        System.out.println(" order delivered ");
    }
}
