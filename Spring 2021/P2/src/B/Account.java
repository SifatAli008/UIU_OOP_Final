package B;

public class Account {

    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalance {
        if (amount > balance) {
            throw new InsufficientBalance(balance, amount);
        }
        balance -= amount;
    }
}
