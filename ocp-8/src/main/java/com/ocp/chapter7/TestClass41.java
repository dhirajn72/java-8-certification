/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter7;

import java.io.Console;
import java.util.Arrays;
import java.util.Locale;

/**
 * @author Dhiraj
 * @date 19/09/18
 */
public class TestClass41 {
    public static void main(String[] args) {
        Console console=System.console();
        System.out.println(console);
        console.format("Enter your first name::");
        console.writer().println();
        //String fName=console.readLine();
        console.format("Enter your last name::");
        console.writer().println();
        //String lName=console.readLine();
        //System.out.println("your full name is::"+fName+" "+lName);
        console.format("Enter your password::");
        console.writer().println();
        //char[] pass= console.readPassword();
        StringBuilder builder=new StringBuilder();
        //for (char c:pass)
          //  builder.append(c);
        console.format("your password is ::"+  builder );
        console.writer().println();
        //console.writer().println("your inputs::"+fName+" "+lName+" "+builder);
        console.writer().format(new Locale("fr","CA"),"Hello World!");
        console.writer().println();
        console.writer().println("Hi");
        long l='c';
        System.out.println(l);
    }
}
