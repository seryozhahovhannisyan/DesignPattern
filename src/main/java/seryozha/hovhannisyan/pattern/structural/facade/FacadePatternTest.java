package seryozha.hovhannisyan.pattern.structural.facade;

/**
 * Created by Seryozha on 1/29/2017.
 */
public class FacadePatternTest {
    public static void main(String[] args) {
        String tableName = "Employee";

        //generating MySql HTML report and Oracle PDF report without using Facade
        Connection con = FMySqlHelper.getMySqlDBConnection();
        FMySqlHelper mySqlHelper = new FMySqlHelper();
        mySqlHelper.generateMySqlHTMLReport(tableName, con);

        Connection con1 = FOracleHelper.getOracleDBConnection();
        FOracleHelper oracleHelper = new FOracleHelper();
        oracleHelper.generateOraclePDFReport(tableName, con1);

        //generating MySql HTML report and Oracle PDF report using Facade
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
    }
}
