/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test4;

/**
 * @author Dhiraj
 * @date 24/08/18
 */
public class TestClass4 {

}
class OuterWorld
{
    public InnerPeace i = new InnerPeace();
    private class InnerPeace
    {
        private String reason = "none";
    }

    void doIt(){
        System.out.println(i.reason);
    }
}