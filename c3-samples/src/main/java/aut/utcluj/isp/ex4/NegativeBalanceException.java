package aut.utcluj.isp.ex4;

public class NegativeBalanceException extends Exception {

    public NegativeBalanceException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.getMessage();
    }

}
