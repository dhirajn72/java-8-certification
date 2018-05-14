/*
 * All Rights Reserved @Dhiraj
 */

class Lab5{
    public static void main(String[] args){
        Hello5 h = new Hello5();
       // h.process();

    }
}

interface Inter5Super{
    default void process(){
    System.out.println("process()-Inter5Super ");  
    }
    
    default void show(){
           System.out.println("show()");
    }

}
interface Inter5Sub1 extends Inter5Super{
    
    
    default void process(){
        System.out.println("process()-Inter5Sub1 ");  
        }
}
interface Inter5Sub2 extends Inter5Super{
    
    default void process(){
        System.out.println("process()-Inter5Sub2 ");  
        }
        
}

//Change the order of Inteface and test
class Hello5  implements Inter5Sub1,Inter5Sub2{
    @Override
    public void process() {

    }
    // public  void process(){
    //     System.out.println("process()-Hello5 ");  
    //   //  Inter5Sub1.super.process();
    //     }  
}