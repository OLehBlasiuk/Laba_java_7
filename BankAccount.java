public class BankAccount {
    public final String user;
    public final String account;
    public double balance;
    public final String currency;

    public BankAccount(String user, String account, double balance, String currency) {
        this.user = user;
        this.account = account;
        this.balance = balance;
        this.currency = currency;
    }

    public String getUser() {
        return user;
    }

    public String getAccount() {
        return account;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}