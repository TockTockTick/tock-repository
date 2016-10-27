/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalagency;

/**
 *
 * @author yubai
 */
public class Customer {
    String name;
    int id;
    String address;
    int cc;
    
    public Customer(String name, int id, String address, int cc){
        this.name = name;
        this.id = id;
        this.address = address;
        this.cc = cc;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getID(){
        return this.id;
    }
    
    
}
