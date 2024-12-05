public class InsufficientFundsException extends Exception {/*class  inherits from the Exception class
   which is the base class for all checked exceptions*/

    public InsufficientFundsException(String message) {/*InsufficientFundsException class constructor that accepts
     a String message when exception is thrown*/

        super(message);//constructor accepts a message and passes it to the superclass(Exception)//

    }


}