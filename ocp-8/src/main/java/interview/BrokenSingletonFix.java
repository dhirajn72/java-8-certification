/*
 * All Rights Reserved @Dhiraj
 */

package interview;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/**
 * @author Dhiraj
 * @date 31/03/19
 */
public class BrokenSingletonFix {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Singleton> singletonClass= (Class<Singleton>) Class.forName("interview.Singleton");
        Constructor[] constructors= singletonClass.getDeclaredConstructors();
        constructors[0].setAccessible(true);
        System.out.println(Singleton.getInstance());
        System.out.println(constructors[0].newInstance());

        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());

    }
}

class Singleton implements Cloneable,Serializable{
    private static volatile Singleton instance=null;

    private Singleton(){
        if (instance!=null)
            throw new InstantiationError("Already there");
    }
    public static Singleton getInstance(){
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null)
                    instance=new Singleton();
            }
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }

    private Object readResolve(){
        return getInstance();
    }
}
