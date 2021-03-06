/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Dhiraj
 * @date 29/07/18
 */

public class Zoo_fr_CA extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"hi","kaa haal baaa ho"},
                {"hello","Hi there"}
        };
    }

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en"));
        ResourceBundle bundle= ResourceBundle.getBundle("com.ocp.chapter5.Zoo", new Locale("fr","CA"));
        System.out.println(bundle.getObject("hi"));
    }
}
