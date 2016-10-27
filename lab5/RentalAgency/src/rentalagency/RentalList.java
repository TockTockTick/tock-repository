/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalagency;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author yubai
 */
public class RentalList {
    
    RentalList(ArrayList<Rental> z){
        rentList = z;
    }
    
    ArrayList<Rental> rentList;
            //= new ArrayList<Rental>();
    
    public void getInfo(int conID, String name){
        
        for (int i = 0; i <= rentList.size(); i++){
            if(rentList.get(i).getCustID() == conID && rentList.get(i).getPaid() == false){
                System.out.println("Rental info: "+rentList.get(i).getInfo()+"\n");
            }
        }
        
    }
    
    public void createRental(int custID, int carID, int payment, int dateIn, int dateOut, int payDue){
        rentList.add(new Rental(custID, carID, payment, dateIn, dateOut, payDue));
        System.out.println("Rental successful!!\nInformation as following:\n"+
                rentList.get(rentList.size()-1).getInfo());
    }
    
    public void outD(int custID, int out){
        for (int i = 0; i < rentList.size(); i++){
            if(rentList.get(i).getPaid() == false && rentList.get(i).getCustID() == custID){
                rentList.get(i).setDateOut(out);
            }
        }
   }
    public void inD(int custID, int in){
        for (int i = 0; i < rentList.size(); i++){
            if (rentList.get(i).getPaid() == false && rentList.get(i).getCustID() == custID){
                rentList.get(i).setDateIn(in);
            }
        }
    }
    public int getdueDate(int uID){
        for (int i =0; i <rentList.size(); i++){
            if (rentList.get(i).getCustID() == uID){
                
                return rentList.get(i).getdueDate();
            }
        }
        return -1;
    }
    
    public int getdropoffDate(int uID){
        for (int i = 0; i < rentList.size(); i++){
            if (rentList.get(i).getCustID() == uID){
                return rentList.get(i).dateIn();
            }
        }
        return -1;
    }
    
    public int getpickupDate(int uID){
        for (int i = 0; i < rentList.size(); i++){
            if (rentList.get(i).getCustID() == uID){
                return rentList.get(i).dateOut;
            }
        }
        return -1;
    }
    
    public Rental getRental(int uID){
        for (int i = 0; i < rentList.size();i++){
            if (rentList.get(i).getCustID() == uID){
                return rentList.get(i);
            }
        }
        return null;
    }
    
    public int getcarID(int uID){
        for (int i = 0; i < rentList.size(); i++){
            if (rentList.get(i).getCustID() == uID && rentList.get(i).getPaid() == false){
                return rentList.get(i).getcarID();
            }
        }
        return -1;
    }
    
    public Car getCar(CarList c, int carID){
        for (int i = 0; i < rentList.size(); i++){
            if(c.findCar(i).getID() == carID){
                return c.findCar(i);
            }
        }
        return null;
    }
    
    public void changePaid(int cusID){
        for (int i = 0; i < rentList.size(); i++){
            if(rentList.get(i).getCustID() == cusID && rentList.get(i).getPaid() != true){
                rentList.get(i).changePaid();
                
            }
        }
    }
}
