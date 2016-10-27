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
public class CarList {
   
    
    public CarList(ArrayList<Car> z){
        carList = z;
    }
        
   ArrayList<Car> carList;
    
    
    public Car findCar(int carID){
        return carList.get(carID);
    }
    
    public void CreateInfo(){
        for(int i=0; i<carList.size(); i++){
        Car carTemp = carList.get(i);
        System.out.println(carTemp.getInfo()+"\n");
        }
    }
    
   public void carBool(int carID){
       carList.get(carID).changeAvail();
       
   }
    
}
    
    

