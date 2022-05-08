package aut.utcluj.isp.ex4;

public class NegativeAmountException extends Exception {

    public NegativeAmountException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.getMessage();
    }

}
