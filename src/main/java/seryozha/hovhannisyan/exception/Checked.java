package seryozha.hovhannisyan.exception;

import java.io.IOException;
import java.sql.SQLException;

public class Checked {

    public static void main(String[] args) {
        try {
            main();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main() throws ClassNotFoundException, SQLException, IOException {

    }
}
