package seryozha.hovhannisyan.pattern.structural.facade;

/**
 * Created by Seryozha on 1/29/2017.
 */
public class FOracleHelper {

    public static Connection getOracleDBConnection() {
        System.out.println("get Oracle DB connection using connection parameters");
        return null;
    }

    public void generateOraclePDFReport(String tableName, Connection con) {
        System.out.println("get data from table and generate pdf report");
    }

    public void generateOracleHTMLReport(String tableName, Connection con) {
        System.out.println("get data from table and generate html report");
    }
}
