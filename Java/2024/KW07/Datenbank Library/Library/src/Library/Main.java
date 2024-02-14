package Library;

import Library.DB;
import Library.*;

import java.sql.SQLException;

public class Main {

    private static void connection (){
        try (var connections = DB.connect()) {
            System.out.println("Connected to the PostgreSQL database.");
        }catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        connection();

        start starter = new start();
        starter.start();




    }
}