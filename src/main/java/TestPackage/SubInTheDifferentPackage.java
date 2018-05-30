/*
 * All Rights Reserved @Dhiraj
 */

package TestPackage;

import com.oracle.SuperClass;

/**
 * @author Dhiraj
 * @date 20/05/18
 */
public class SubInTheDifferentPackage extends SuperClass{
        public static void main(String[] args) {
            new SubInTheDifferentPackage().show();
        }
        public void show(){
            //System.out.println(x); // Can't be access even by the subclass because x is default scoped or packaged scoped
            System.out.println(y); // Valid, only protected can be accessed by subclass from dirrent package
            System.out.println(z); // Always allowed, it can be accessed by sub class and non subclass becuase its public scoped !!
        }
}
