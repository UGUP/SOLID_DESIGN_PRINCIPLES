package OCP.Following;

public class PostgresDB implements  Database{
    @Override
    public void saveToDb() {
        System.out.println(" saving to Postgres");
    }
}
