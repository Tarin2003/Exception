
package exception;


public class Exception {

    
    public static void main(String[] args) {
        
        try{
        String name =null;
        System.out.println(name.charAt(0));
        }catch(ArithmeticException e){
            System.out.println("Exception = "+e);
        }
        finally{
            System.out.println("bbb");
       
        }
    
 
    }
}
