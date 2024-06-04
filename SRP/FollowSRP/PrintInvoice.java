package SRP.FollowSRP;

import java.sql.SQLOutput;

public class PrintInvoice {
    private Invoice invoice;

    public PrintInvoice(Invoice invoice){
        this.invoice= invoice;
    }


    public void printInvoice(){
        System.out.println(" printing the invoice");
    }
}
