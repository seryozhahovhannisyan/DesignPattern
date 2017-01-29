package seryozha.hovhannisyan.pattern.structural.facade;

/**
 * Created by Seryozha on 1/29/2017.
 */
public class FMySqlHelper {

    public static Connection getMySqlDBConnection() {
        System.out.println("get MySql DB connection using connection parameters");
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con) {
        System.out.println("get data from table and generate pdf report");
    }

    public void generateMySqlHTMLReport(String tableName, Connection con) {
        System.out.println("get data from table and generate html report");
    }
}
