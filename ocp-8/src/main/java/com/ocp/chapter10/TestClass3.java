/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter10;

import java.sql.*;

/**
 * @author Dhiraj
 * @date 19/07/18
 */
public class TestClass3 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //String url="jdbc:derby:zoo;create=true";
        //String url="jdbc:derby://localhost:1527/dbname;create=true";
        String url="jdbc:mysql://localhost:3306/ocp-test";
        //welcome
        //Class.forName("com.mysql.jdbc.Driver");

        try(Connection con= DriverManager.getConnection(url,"root","welcome");
            Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY)) {
            ResultSet rs=stmt.executeQuery("select * from animal");
            while (rs.next())
                System.out.println(rs.getInt(1)+" "+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getDate(4) );
        }
    }
}