package OCP.NotFollowing;



public class SaveInvoice {

    private Invoice invoice;


    public SaveInvoice(Invoice invoice){
        this.invoice=invoice;
    }

    public void saveToDB(DatabaseType db){
        if(db==DatabaseType.Mysql){
            System.out.println("posting to mysqldb");
        }else if(db==DatabaseType.POSTGRES){
            System.out.println(" posting to postgres");
        }
    }


}
