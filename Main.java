public class Main {
    public static void main(String[] args) {
        BankAccount mono1 = new BankAccount("Leo", "MonoBank", 2005, "USD");
        BankAccount mono2 = new BankAccount("Leo", "MonoBank", 2125, "UAH");
        BankAccount mono3 = new BankAccount("Dorian", "MonoBank", 2400, "EURO");
        BankAccount priv1 = new BankAccount("Dorian", "Privat24", 2600, "USD");
        BankAccount priv2 = new BankAccount("Leo", "Privat24", 1800, "CAD");

        Bank Mono1 = new Bank(mono1.getUser(), mono1.getAccount(), mono1.getBalance(), mono1.getCurrency());
        Bank Mono2 = new Bank(mono2.getUser(), mono2.getAccount(), mono2.getBalance(), mono2.getCurrency());
        Bank Mono3 = new Bank(mono3.getUser(), mono3.getAccount(), mono3.getBalance(), mono3.getCurrency());
        Bank Priv1 = new Bank(priv1.getUser(), priv1.getAccount(), priv1.getBalance(), priv1.getCurrency());
        Bank Priv2 = new Bank(priv2.getUser(), priv2.getAccount(), priv2.getBalance(), priv2.getCurrency());

        Bank.transferMoney(Mono2, Mono1, 1000);
        Bank.transferMoney(Mono3, Mono1, 500);
        Bank.transferMoney(Priv1, Mono1, 1500);
        Bank.transferMoney(Priv2, Mono1, 700);
    }
}
