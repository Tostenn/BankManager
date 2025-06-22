public class CheckingAccount extends BankAccount {
    private double limit;

    public CheckingAccount(String account, double balance, double limit) {
        super(account, balance);
        this.limit = limit;
    }

    @Override
    public void withdraw(double amount) {
        if (balance + limit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Solde insuffisant, même avec la limite");
        }
    }

    public double getLimit() {
        return limit;
    }
}
