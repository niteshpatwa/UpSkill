package exceptions;

public class OutofQuotaException extends Exception {
    public OutofQuotaException(){
        super("The caller is out of quota");
    }

    public OutofQuotaException(String message) {
        super(message);
    }
}
