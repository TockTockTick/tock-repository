/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalagency;

import java.util.ArrayList;


/**
 *
 * @author yubai
 */
public class CustList{
    
    public CustList(ArrayList<Customer> z){
        custList = z;
    }
        
   ArrayList<Customer> custList = new ArrayList<Customer>();
   
    
    
    public int getInfo(String name, String address, int cc){
        for (int i=0; i<custList.size(); i++){
            
            Customer temp = custList.get(i);
            
            if (temp.getName() == name){
                return temp.getID();
            }
        }
        return 0;
    }
    public void createCust(String name, String address, int cc){
        custList.add(new Customer(name,custList.size(), address, cc));
        System.out.println("You're The Customer: \n" + "Name: " + name + "\n" + "ID: " + custList.size() +"\n" +
                "Address: " + address +"\n" + "Credit Card: " + cc);
    }
    
}
       
