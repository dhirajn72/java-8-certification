/*
 * All Rights Reserved @Dhiraj
 */

package com.ocp.chapter9;

import java.io.*;

/**
 * @author Dhiraj
 * @date 08/09/18
 */
public class TestClass1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*Moo moo = new Moo();
        moo.moo = 20;
        FileOutputStream fos = new FileOutputStream("moo.ser");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(moo);
        os.close();*/


        FileInputStream fis = new FileInputStream("moo.ser");
        ObjectInputStream is = new ObjectInputStream(fis);
        Moo moo = (Moo) is.readObject();
        is.close();
        System.out.println(moo.moo);
    }
}

//class Boo implements Serializable{
class Boo {
        public Boo(){ System.out.println("In Boo"); }
}
//class BooBoo extends Boo implements Serializable {
class BooBoo extends Boo  {
    public BooBoo(){ System.out.println("In BooBoo"); }
}

class Moo extends BooBoo implements Serializable {
    int moo = 10; { System.out.println("moo set to 10"); }
    public Moo(){ System.out.println("In Moo"); }
}


