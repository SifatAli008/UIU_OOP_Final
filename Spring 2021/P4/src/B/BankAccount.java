
package B;

public class BankAccount {
   double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
   
    void updateBalance(double newBalance){
    balance+=newBalance;
    }
}
