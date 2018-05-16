/*
 * All Rights Reserved @Dhiraj
 */

import com.java.core.Telescope;

/**
 * @author Dhiraj
 * @date 14/05/18
 */
public class String1 {
    public static void main(String[] args) {
        System.out.println("main!!!");
        System.out.println(String.x);
    }
}
class String{
    static int x;
    static {
        System.out.println("loaded");
    }
}