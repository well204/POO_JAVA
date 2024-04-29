package classes;

public class BankAccount {
    private int accountNumber;
    private String cardHolderName;
    private double balance;

    public BankAccount(int accountNumber, String cardHolderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.cardHolderName = cardHolderName;
        deposit(initialDeposit);
    }

    public BankAccount(int accountNumber, String cardHolderName) {
        this.accountNumber = accountNumber;
        this.cardHolderName = cardHolderName;
    }

    public void deposit(double cash) {
        this.balance += cash;
    }

    public void withdraw(double cash) {
        this.balance -= cash + 5;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public double getbalance() {
        return balance;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    @Override
    public String toString() {
        String accountDataInfo = "Account " + this.accountNumber + ", Holder: " + cardHolderName +
                ", Balance: $" + String.format("%.2f", balance);
        return accountDataInfo;
    }
}
