package SRP.FollowSRP;

public class SaveInvoice {

    private  Invoice invoice;

    public SaveInvoice(Invoice invoice){
        this.invoice=invoice;
    }


    public void saveTODb(){
        System.out.println(" saving Invoice to db");
    }
}
