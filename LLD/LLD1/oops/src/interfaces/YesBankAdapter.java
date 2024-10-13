package interfaces;

public class YesBankAdapter implements BankingService{
    @Override
    public void transferMoney() {
        System.out.println("Transfer Money using Yes Bank");
    }

    @Override
    public int getBalance() {
        System.out.println("Get Balance using Yes Bank");
        return 0;
    }
}
