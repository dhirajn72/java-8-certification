/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter5;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Dhiraj
 * @date 16/09/18
 */
public class TestClass19 {
    public static void main(String[] args) {
        Locale locale=new Locale("fr","CA");
        Locale.setDefault(locale);
        //System.out.println(Locale.getDefault());

        ResourceBundle bundle=ResourceBundle.getBundle("zoo",locale);
        bundle.keySet().stream().forEach(x->System.out.println(x+"="+bundle.getObject(x)));

        String message=bundle.getString("a");
        //System.out.println(MessageFormat.format(message,3));
        System.out.println(message);
        System.out.println(MessageFormat.format(bundle.getString("hello"),"Dhiraj","kumar"));
    }
}
