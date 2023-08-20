
package B;


public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(0.0){
        void updateBalance(){
            System.out.println("The balance has been update");
        }
        };
        account.updateBalance(1000);

    }
}
