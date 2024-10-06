public class Bank {
    public String user;
    public String account;
    public double count;

    public String currency;

    Bank(String user, String account, double count, String currency) {
        this.user = user;
        this.account = account;
        this.count = count;
        this.currency = currency;
    }

    public static void transferMoney(Bank sender, Bank receiver, double moneyToTransfer) {
        if (!sender.currency.equals(receiver.currency)) {
            // Example exchange logic
            if (receiver.currency.equals("UAH")) {
                receiver.count = exchangeUAHToUSD(receiver.count, "UAH");
                receiver.currency = "USD"; // Change the currency after conversion
            } else if (sender.currency.equals("UAH")) {
                sender.count = exchangeUAHToUSD(sender.count, "UAH");
                sender.currency = "USD"; // Change the currency after conversion
            }
        }

        // Commission
        if (sender.user.equals(receiver.user)) {
            if (sender.account.equals(receiver.account)) {
                sender.count += moneyToTransfer; // Full transfer, no commission
            } else {
                sender.count += moneyToTransfer * 0.98; // 2% commission
            }
        } else {
            if (sender.account.equals(receiver.account)) {
                sender.count += moneyToTransfer * 0.97; // 3% commission
            } else {
                sender.count += moneyToTransfer * 0.94; // 6% commission
            }
        }
        receiver.count -= moneyToTransfer;

        System.out.println(sender.user + " " + sender.account + ": " + sender.count + " (" + sender.currency + ")");
        System.out.println(receiver.user + " " + receiver.account + ": " + receiver.count + " (" + receiver.currency + ")");
    }

    private static double exchangeUAHToUSD(double amount, String currency) {
        final double usdRate = 0.042;  // 1 UAH = 0.027 USD
        final double euroRate = 0.045;
        final double cadRate = 0.03;
        switch (currency) {
            case "UAH":
                return amount ;
            case "USD":
                return amount * usdRate;
            case "EURO":
                return amount * euroRate;
            case "CAD":
                return amount * cadRate;
            default:
                return amount;
        }
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getCount() {
        return count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
