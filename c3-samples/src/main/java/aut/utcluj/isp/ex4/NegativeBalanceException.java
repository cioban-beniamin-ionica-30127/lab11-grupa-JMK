package aut.utcluj.isp.ex4;

/**
 * @author stefan
 */
public class NegativeBalanceException extends Exception {

    public NegativeBalanceException(String message) {
        super(message);
        System.out.println(super.getMessage());
    }

    @Override
    public String toString() {
        return super.getMessage();
    }

}
