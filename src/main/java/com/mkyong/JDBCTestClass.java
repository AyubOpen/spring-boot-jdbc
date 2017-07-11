package com.mkyong;

import java.nio.charset.Charset;

/**
 * Created by KOUSAR on 7/8/2017.
 */
public class JDBCTestClass {
    public static void main(String[] args) {
        System.out.println("Default Charset=" + Charset.defaultCharset());
        System.out.println("الرياض");
//
//        try {
//
//            Class.forName("oracle.jdbc.driver.OracleDriver");
//
//        } catch (ClassNotFoundException e) {
//
//            System.out.println("Where is your Oracle JDBC Driver?");
//            e.printStackTrace();
//            return;
//
//        }
//
//        System.out.println("Oracle JDBC Driver Registered!");
//
//        Connection connection = null;
//
//        try {
//
//            connection = DriverManager.getConnection(
//                    "jdbc:oracle:thin:@localhost:1521:orcl", "system", "oracledbserviceuser");
//            Statement st=connection.createStatement();
//            ResultSet res=st.executeQuery("SELECT city_name_ar from city where city_id=1");
//
//            while(res.next()){
//                System.out.println("itemName: "+res.getString(1));
//            }
//        } catch (Exception e) {
//
//            System.out.println("Connection Failed! Check output console");
//            e.printStackTrace();
//            return;
//
//        }
//
//        if (connection != null) {
//            System.out.println("You made it, take control your database now!");
//        } else {
//            System.out.println("Failed to make connection!");
//        }


    }
}
