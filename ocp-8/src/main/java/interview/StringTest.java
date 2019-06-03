/*
 * All Rights Reserved @Dhiraj
 */

package interview;

/**
 * @author Dhiraj
 * @date 03/04/19
 */
public class StringTest {
    public static void main(String[] args) {
        String s1="Main";
        String s2="Test1".intern();
        String s3="Test1";
        System.out.println(s1==s2);
        System.out.println(s2==s3);



    }
}
