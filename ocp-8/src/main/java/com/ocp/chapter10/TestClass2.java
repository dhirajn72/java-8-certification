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
public class TestClass2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        //String url="jdbc:derby:zoo;create=true";
        //String url="jdbc:derby://localhost:1527/dbname;create=true";
        String url="jdbc:mysql://localhost:3306/ocp-test";
        //welcome
        //Class.forName("com.mysql.jdbc.Driver");

        try(Connection con= DriverManager.getConnection(url,"root","welcome");
            Statement stmt=con.createStatement()) {
           //int res= stmt.executeUpdate("create table test (id integer primary key,name varchar(100))");
            //System.out.println("Table created in derby ::"+res);
            //stmt.executeUpdate("create table species (id integer primary key,name varchar(100),num_acres decimal)");
            //stmt.executeUpdate("create table animal (id integer primary key,species_id integer, name varchar(100),date_born timestamp,foreign key(species_id) references species(id)  )");
            System.out.println("created!");
            /*stmt.executeUpdate("insert into species values (1,'African Elephant',7.5)");
            stmt.executeUpdate("insert into species values (2,'Zebra',1.2)");
            stmt.executeUpdate("insert into animal values (1,1,'Elsa','2001-05-06 02:15')");
            stmt.executeUpdate("insert into animal values (2,2,'Zelda','2002-08-05 09:12')");
            stmt.executeUpdate("insert into animal values (3,1,'Ester','2002-09-09 10:36')");
            stmt.executeUpdate("insert into animal values (4,1,'Eddie','2010-06-08 01:24')");
            stmt.executeUpdate("insert into animal values (5,2,'Zoe','2005-11-12 03:44')");*/
        }
    }
}
