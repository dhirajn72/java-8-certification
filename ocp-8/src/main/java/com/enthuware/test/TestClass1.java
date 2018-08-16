/*
 * All Rights Reserved @Dhiraj
 */

package com.enthuware.test;

/**
 * @author Dhiraj
 * @date 09/08/18
 */
    interface I { }

     enum EnumA implements I { A, AA, AAA};  //1


 public    class TestClass1
    {
        public enum EnumB{ B, BB, BBB;
           //public Object clone(){ return B; } //2


        }

        public static enum EnumC{ C, CC, CCC };

        //public static enum EnumD extends EnumC{ DDD }; //3

        public TestClass1()
        {
            //System.out.println(EnumC.CC.index()); //4
            System.out.println(EnumC.CC.ordinal()); //4

        }


        public static void main(String[] args)
        {
            System.out.println(EnumC.valueOf("ccc")); //5
            System.out.println(EnumC.CCC.name()); //6
        }
    }

