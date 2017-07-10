package com.mkyong;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by KOUSAR on 7/8/2017.
 */
public class JDBCTestClass {
    public static void main(String[] args) {

        System.out.println("-------- Oracle JDBC Connection Testing ------");

        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your Oracle JDBC Driver?");
            e.printStackTrace();
            return;

        }

        System.out.println("Oracle JDBC Driver Registered!");

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe", "jahezdbapp", "oracle");
            Statement st=connection.createStatement();
            ResultSet res=st.executeQuery("SELECT menu_item_name from pending_menu_item where menu_item_id=6062");

            while(res.next()){
                System.out.println("itemName: "+res.getString(1));
            }
        } catch (Exception e) {

            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;

        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }


    }
}
