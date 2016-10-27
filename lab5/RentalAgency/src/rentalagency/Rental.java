

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalagency;
import java.util.Date;

/**
 *
 * @author yubai
 */
public class Rental {
    int custID;
    int carID;
    int payment;
    int dateIn;
    int dateOut;
    int dueDate;
    boolean paid;
    
    public Rental(int custID, int carID, int payment, int dateIn, int dateOut, int dueDate){
        this.custID = custID;
        this.carID = carID;
        this.payment = payment;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.dueDate = dueDate;
    }
    
     public int getCustID(){
        return custID;
    }
    public int getcarID(){
        return carID;
    }
    public int getPayment(){
        return payment;
    }
    public int dateIn(){
        return dateIn;
    }
    public int dateOut(){
        return dateOut;
    }
    public int dueDate(){
        return dueDate;
    }
    public boolean getPaid(){
        return paid;
    }
    public String getInfo(){
        return "custID: " + custID + "\n" +
               "carID: " + carID + "\n" +
               "payment: " + payment + "\n" +
               "dateIn: " + dateIn + "\n" +
               "dateOut: " + dateOut + "\n" +
               "payDue: " + dueDate + "\n" +
               "Paid?: " + paid +"\n";
    }
    public void changePaid(){
        paid = true;
    }
    public void setDateOut(int out){
        dateOut = out;
    }
    public void setDateIn(int in){
        dateIn = in;
    }
    public int getdueDate(){
        return dueDate;
    }
}
    

