
package bankapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * A banking system that can store accounts in an arraylist and can has the functions
 * of adding new bank accounts to the system or sorting the bank accounts by name or
 * balance in ascending order
 * @author yubai
 */
public class BankingSystem {
    ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
    
    public void add(BankAccount ba){
        accounts.add(ba);
    }
    
    //public void sortByNameDescending(){
    //    Collections.sort(accounts, BankAccount.createComparatorByName(true));
    //  System.out.println("Descending name::");
    //}
    
    /**
     * sort all accounts by name in ascending order
     */
    public void sortByNameAscending(){
        Collections.sort(accounts, BankAccount.createComparatorByName(false));
      
    }
    
    
    //public void sortByBalanceDescending(){
    //    Collections.sort(accounts, BankAccount.createComparatorByBalance(true));
    //  System.out.println("Descending balance::");
    //}
    
    /**
     * sort all accounts by balance in ascending order
     */
    public void sortByBalanceAscending(){
        Collections.sort(accounts, BankAccount.createComparatorByBalance(false));
      
    }
    
    
    
    
       
       
    

           
}
       
    
    
    

