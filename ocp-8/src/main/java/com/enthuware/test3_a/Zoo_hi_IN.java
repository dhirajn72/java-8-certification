/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test3_a;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Dhiraj
 * @date 02/09/18
 */
public class Zoo_hi_IN extends ListResourceBundle {
    public static void main(String[] args) {

        Locale locale= new Locale("hi","IN");
        ResourceBundle bundle= ResourceBundle.getBundle("com.enthuware.test3_a.Zoo_en_US",locale);
        bundle.keySet().stream().forEach(x-> System.out.println(x+":"+bundle.getObject(x)));
    }
    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"a", "apple"}, {"b", "ball"}, {"c", "cat"}, {"d", "dog"}
        };
    }
}
