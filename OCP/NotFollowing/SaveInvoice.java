package OCP.NotFollowing;

public class SaveInvoice {

    private Invoice invoice;

    public SaveInvoice(Invoice invoice){
        this.invoice=invoice;
    }


    public void saveTOMYSQL(){
        System.out.println(" saving Invoice to db");
    }

    public void saveToPOSTGRES(){
        System.out.println("saving to file ");
    }/// there is a problem if tomorrow you want to save it to a different db ?? VIOLATES OCP
}
