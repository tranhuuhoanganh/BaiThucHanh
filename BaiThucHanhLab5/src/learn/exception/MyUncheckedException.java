
package learn.exception;


public class MyUncheckedException extends RuntimeException{

    public MyUncheckedException(String msg){
        super(msg);
    }
    
    public class UncheckedExceptionDemo{
        public static void main(String[] args) {
            UncheckedExceptionDemo.testUncheckedException();
        }
        
        public static void testUncheckedException()
        throws MyUncheckedException{
            System.out.println("Unchecked Exception Demo");
            
        }
    }
        
    }
    

