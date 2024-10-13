package interfaces;

public class Main {
    public static void main(String[] args) {
        Phonepe phonepe = new Phonepe(new ICICIBankAdapter());
        phonepe.sendMoney();
        phonepe.checkBalance();
    }
}
