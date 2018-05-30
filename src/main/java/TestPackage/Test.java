/*
 * All Rights Reserved @Dhiraj
 */

package TestPackage;

/**
 * @author Dhiraj
 * @date 20/05/18
 */
class Test{
    public static void main(String[] args){
        String hello = "Hello", lo = "lo";
        System.out.print((TestPackage.Other.hello == hello) + " ");    //line 1
        System.out.print((com.other.Other.hello == hello) + " ");   //line 2
        System.out.print((hello == ("Hel"+"lo")) + " ");           //line 3
        System.out.print((hello == ("Hel"+lo)) + " ");              //line 4
        System.out.println(hello == ("Hel"+lo).intern());          //line 5
    }
}

class Other { static String hello = "Hello"; }


