
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestGeneric {

    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new BankAccount("Rasha", "011123", 12000));
        accounts.add(new BankAccount("Keya", "011124", 10500));
        accounts.add(new BankAccount("Asad", "011125", 100000));
        Collections.sort(accounts, new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount account1, BankAccount account2) {
                return Double.compare(account1.getBalance(), account2.getBalance());
            }
        });
        
        System.out.println("Accounts sorted in Ascending order:");
        System.out.println(accounts);
    }
}
