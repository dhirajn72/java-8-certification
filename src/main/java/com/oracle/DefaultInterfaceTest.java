/*
 * All Rights Reserved @Dhiraj
 */

package com.oracle;

/**
 * @author Dhiraj
 * @date 20/05/18
 */
public class DefaultInterfaceTest {
}

interface Inter3{
    default void doStuff(){
        System.out.println("Inter3-doStuff");
    }
}
interface Inter4{
    default void doStuff(){
        System.out.println("Inter4-doStuff");
        //return 0;
    }
}
/**
 *  If both the interfaces have the same method, compiler forces you to have your version
 *  doStuff(),
 *
 */
class Test implements Inter3,Inter4{

    // If you comment this method, compilation fails, because
    @Override
    public void doStuff() {

    }

    public void show(){
        doStuff();
    }

}
