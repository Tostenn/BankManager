public class BankAccount {
    protected String account;
    protected double balance;

    public BankAccount(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Solde insuffisant");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccount() {
        return account;
    }
}
