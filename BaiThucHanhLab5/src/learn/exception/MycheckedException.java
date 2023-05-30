
package learn.exception;


public class MycheckedException extends Exception{
    public MycheckedException(String msg){
        super(msg);
    }
    
    public class checkedExceptionDemo{
        public static void main(String[] args) {
            checkedExceptionDemo.testcheckedException();
        }
        
        public static void testcheckedException()
        throws MycheckedException {
            System.out.println("Uhecked Exception Demo");
            
        }
    }
        
}
