/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter6;

import java.io.IOException;
import java.sql.SQLException;
import java.time.format.DateTimeParseException;

/**
 * @author Dhiraj
 * @date 12/07/18
 */
public class TestClass5 {
    public static void main(String[] args) {
        new TestClass5().multiCatch();
        SQLException s=new SQLException();
        //System.out.println(s instanceof IOException);
    }
    public void multiCatch(){
        int x=1;
        try{
            pasrseData(x);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    private void pasrseData(int x)throws SQLException {
        if(x==1)throw  new SQLException();
        else
            throw  new DateTimeParseException("date time", "date", 4);
    }
}
