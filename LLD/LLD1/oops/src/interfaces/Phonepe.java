package interfaces;

public class Phonepe {
    private BankingService api;

    public Phonepe(BankingService api) {
        this.api = api;
    }

    void sendMoney(){
        api.transferMoney();
    }

    int checkBalance(){
        return api.getBalance();
    }
}
