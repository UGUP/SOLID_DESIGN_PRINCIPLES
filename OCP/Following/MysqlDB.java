package OCP.Following;

import lombok.Data;

public class MysqlDB implements Database {
    @Override
    public void saveToDb() {
        System.out.println(" saving data to Mysql");
    }
}
