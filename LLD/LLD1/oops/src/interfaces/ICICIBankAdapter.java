package interfaces;

public class ICICIBankAdapter implements BankingService {
    @Override
    public void transferMoney() {
        System.out.println("Transfer Money using ICICI Bank");
    }

    @Override
    public int getBalance() {
        System.out.println("Get Balance using ICICI Bank");
        return 0;
    }
}
