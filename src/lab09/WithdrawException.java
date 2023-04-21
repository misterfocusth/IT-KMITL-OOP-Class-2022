package lab09;

public class WithdrawException extends Exception {

    public WithdrawException() {
        this("");
    }
    public WithdrawException(String s) {
        super(s);
    }


}
