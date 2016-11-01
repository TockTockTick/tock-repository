
package bankapp;

/**
 * A bank application that has the functions of sorting accounts by name or by balance
 * @author yubai
 */
public class BankApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        BankingSystem system = new BankingSystem();
        
        //add accounts
        system.add(new BankAccount("YuguanBai", 800));
        system.add(new BankAccount("HilCli", 1600000));
        system.add(new BankAccount("BilCli", 1));
        system.add(new BankAccount("JorBus", 100));
        system.add(new BankAccount("DonTru", 24538902));
        
        //sort by balance in ascending order
        system.sortByBalanceAscending();
        //print out the result
        System.out.println("Ascending balance::");
        for (BankAccount a : system.accounts)
         System.out.println(a.getName() + " " + a.getBalance());
         System.out.println();
        
         //sort by name in ascending order
        system.sortByNameAscending();
        //print out the result
        System.out.println("Ascending name::");
        for (BankAccount a : system.accounts)
            System.out.println(a.getName() + " " + a.getBalance());
            System.out.println();
        
        
        
    }
    
}
