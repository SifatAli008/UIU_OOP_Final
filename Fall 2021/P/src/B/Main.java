
package B;

public class Main {
    public static void main(String[] args) throws MinimumBalanceException { 
        try{
        int acc[]= {100,101,102,103,103,105};
        double balance[]={1000,1500,900,1560,1765.50};
            for (int i = 0; i < 10; i++) {
              if (balance[i] < 1000) {
                    throw new MinimumBalanceException("Account " + acc[i] + " has a balance below the minimum required balance.");
                } else {
                    System.out.println(acc[i] + "\t\t" + balance[i] + '\t');
                }
            }
        }
        catch(MinimumBalanceException e){
            System.out.println(e.getMessage());
        }
    }
    
      
}
