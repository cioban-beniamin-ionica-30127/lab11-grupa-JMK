package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public class NegativeAmountException extends Exception {

    public NegativeAmountException(String message) {
        super(message);
        System.out.println(super.getMessage());
    }

    @Override
    public String toString() {
        return super.getMessage();
    }
    

    

    
}
