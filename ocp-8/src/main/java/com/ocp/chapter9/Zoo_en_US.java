/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import java.util.ListResourceBundle;

/**
 * @author Dhiraj
 * @date 14/09/18
 */
public class Zoo_en_US extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"a", "apple"},
                {"a", "ball"},
                {"a", "cat"},
        };
    }
}
