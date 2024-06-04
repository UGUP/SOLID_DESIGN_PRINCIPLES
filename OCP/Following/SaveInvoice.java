package OCP.Following;

import SRP.FollowSRP.Invoice;

import javax.xml.crypto.Data;

public class SaveInvoice implements  Database{

    private Invoice invoice;
    private Database database;


    public SaveInvoice(Invoice invoice,Database database){
        this.invoice=invoice;
        this.database=database;
    }


    @Override
    public void saveToDb() {
       database.saveToDb();
    }
}
