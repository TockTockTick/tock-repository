
package bankapp;

import java.util.Comparator;

/**
 *
 * @author yubai
 */
public class BankAccount {
 
/**
   An account with a name and a balance
*/

   /**
      Constructs a country.
      @param aName the name of the account
      @param aBalance the balance of the account
   */
   public BankAccount(String aName, double aBalance)
   {
      name = aName;
      balance = aBalance;
   }

   /**
      Gets the name of the BankAccount holder.
      @return the name
   */
   public String getName()
   {
      return name;
   }

   /**
      Gets the balance of the BankAccount.
      @return the balance
   */
   public double getBalance()
   {
      return balance;
   }
   
   
   /**
    * Comparator that sorts by balance
    * @param increasing a parameter of boolean type, used to toggle between descending\
    * and ascending order
    * @return a new Comparator for BankAccount objects
    */
       public static Comparator<BankAccount> createComparatorByBalance(final boolean increasing){
       return new Comparator<BankAccount>(){
           public int compare(BankAccount accon1, BankAccount accon2){
               boolean whoLar;
               whoLar = (accon1.getBalance() < accon2.getBalance());
               if(whoLar == true && increasing){
                    return 1;
               }else if(whoLar == false && increasing){
                    return -1;
               }else if(whoLar == true && !increasing){
                   return -1;
               }else if(whoLar == false && !increasing){
                   return 1;
               }else{
                   return 0;
               }
           }
           
       };
       }
           
           
           /**
    *Comparator that sorts the by name
    * @param increasing a parameter of boolean type, used to toggle between descending
    * and ascending order
    * @return  a new Comparator for BankAccount objects
    */
    public static Comparator<BankAccount> createComparatorByName(final boolean increasing){
       return new Comparator<BankAccount>(){
           public int compare(BankAccount accon1, BankAccount accon2){
               int whoLar;
               whoLar = accon1.getName().compareTo(accon2.getName());
               
               if(whoLar < 0 && increasing){
                   return 1;
               }else if(whoLar > 0 && increasing){
                   return -1;
               }else if(whoLar < 0 && !increasing){
                   return -1;
               }else if(whoLar > 0 && !increasing){
                   return 1;
               }else{
                   return 0;
               }
           }

           
       };
    }
   private String name;
   private double balance;
}
    

