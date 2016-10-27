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
public class Car {
    String name;
    int ID;
    int price;
    boolean avail;
    
    public Car(String name, int ID, int price, boolean avail){
        this.name = name;
        this.ID = ID;
        this.price = price;
        this.avail = avail;
        
    }
    
    public String getInfo(){
        return "Name: " + this.name + "\n" + "ID: " + this.ID +"\n" +
               "Price: " + "$"+this.price+"/month" +"\n" + "Availability: " + this.avail;
    }
    
    public int getID(){
        return ID;
    }
    
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public void changeAvail(){
        if(avail == true){
            avail = false;
        }else{
            avail = true;
        }
    }
    
    public int getcarID(){
        return ID;
    }
}
