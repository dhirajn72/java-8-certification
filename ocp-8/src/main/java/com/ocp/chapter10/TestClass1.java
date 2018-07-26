/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Dhiraj
 * @date 19/07/18
 */
public class TestClass1 {
    public static void main(String[] args) throws SQLException {
        //String url="jdbc:derby:zoo;create=true";
        String url="jdbc:derby://localhost:1527/dbname;create=true";
        try(Connection con= DriverManager.getConnection(url);
            Statement stmt=con.createStatement()) {
           int res= stmt.executeUpdate("create table test (id integer primary key,name varchar(100))");
            System.out.println("Table created in derby ::"+res);
        }

    }
}
