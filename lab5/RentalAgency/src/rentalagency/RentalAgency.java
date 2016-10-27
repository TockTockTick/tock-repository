/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalagency;


import java.util.*;
/**
 *A class for producing an automatic interaction between customer and the rental agency
 * @author YB LS
 */
public class RentalAgency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome To Rental Agency LS & YB!");
        
        
        ArrayList<Customer> customerBase = new ArrayList<Customer>();
        CustList newCustList = new CustList(customerBase);
        
        System.out.println("Please Enter Your Name, Address, & Credit Card #");
        
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        String address = in.nextLine();
        int cc = in.nextInt();
        findCust(newCustList, name, address, cc);
        
        ArrayList<Car> carBase = new ArrayList<Car>();
        carBase.add(new Car("Subaru Impreza", carBase.size(), 25, true));
        carBase.add(new Car("Toyota Celica", carBase.size(), 20, true));
        carBase.add(new Car("Volvo v12", carBase.size(), 35, true));
        carBase.add(new Car("BMW e-36", carBase.size(), 40, true));
        carBase.add(new Car("Honda Fit", carBase.size(), 18, true));
                
        CarList newCarList = new CarList(carBase);
        getCarList(newCarList);
        
        //Copied code
        
        ArrayList<Rental>  rentBase = new ArrayList();
        RentalList rentalBase = new RentalList(rentBase);
        
        
        while(true){
        System.out.println("What service do you want?\nFor reserve please press 1, pickup please press 2, dropoff please press 3, pay please press 4");
        int userInput = in.nextInt();
        while(userInput !=1&& userInput!=2&& userInput!=3 && userInput!= 4){
        System.out.println("Please input 1, 2, 3, or 4");
        userInput = in.nextInt();
        }
        if(userInput == 1){
            System.out.println("Enter customer ID:");
            int custID = in.nextInt();
            System.out.println("Enter the car ID:");
            int carID = in.nextInt();
            System.out.println("Enter the scheduled pick up date:");
            int dateOut = in.nextInt();
            System.out.println("Enter the scheduled drop off date:");
            int dateIn = in.nextInt();
            System.out.println("Enter the due date:");
            int payDue = in.nextInt();
            rentalBase.createRental(custID, carID, newCarList.findCar(carID).getPrice(), dateIn, dateOut, payDue);
            newCarList.carBool(carID);
        }else if(userInput == 2){
            System.out.println("Please enter customer ID:");
            int cuID = in.nextInt();
            System.out.println("Enter the real pickUp date:");
            int dayOut = in.nextInt();
            
            if(dayOut > rentalBase.getRental(cuID).dateOut){
                System.out.println("Even though you are late for pick up, we are still charging the same amount!");
            }else if (dayOut < rentalBase.getRental(cuID).dateOut){
                    System.out.println("Too early, can't give you the car.");
            }else{
            System.out.println("Just in time!");
            }
        
        }else if (userInput == 4){
            System.out.println("Enter customer ID:");
            int cusID = in.nextInt();
            pay(rentalBase,newCarList,cusID);
        }
        
        
        
        else{
            System.out.println("Please enter customer ID:");
            int cuID = in.nextInt();
        
            System.out.println("Enter the real drop off date:");
            int dayIn = in.nextInt();
            rentalBase.inD(cuID, dayIn);
            if(dayIn<=rentalBase.getdropoffDate(cuID)){
                int days = rentalBase.getdropoffDate(cuID) -rentalBase.getpickupDate(cuID);
                System.out.println("You use the car for "+days+" day(s).\n");
                System.out.println("You are supposed to pay: "+days * carBase.get(rentalBase.getcarID(cuID)).getPrice()+" dollar(s)");
            }else{
                System.out.println("You are late.\n GIVE ME ALL YOUR MONEY!!!");
            }
        }
        
        
        
        
        // TODO code application logic here
    }
    }
    /**
     *
     * 
     * 
     */
    public static void findCust(CustList customer, String name, String address, int cc){
        if(customer.getInfo(name, address, cc)==0){
           customer.createCust(name, address, cc);
        }
        else{
            System.out.println("Your Customer ID Is: "+customer.getInfo(name,address,cc));
            
        }
    }
    
    
    public static void getCarList(CarList c){
        System.out.println("\n\n"+"Would You Like To See Our Inventory?"+
                           " yes? (y) no? (n)");
        
        Scanner in = new Scanner(System.in);
        char confirmation = in.next().charAt(0);
        if(confirmation=='y'){
            c.CreateInfo();
        }
        
        else{
            System.out.println("Okay!");
        }
    }
    public static void pay(RentalList r,CarList c, int customerID){
        
        System.out.println("What date is it?");
        Scanner in = new Scanner (System.in);
        int dateToday = in.nextInt();
        
        System.out.println("Want to pay?:"
                + " yes(y) no(n)");
        
        String pay = in.nextLine();
        if (pay == "y" && dateToday <= r.getdueDate(customerID)){
            int days = r.getdropoffDate(customerID)-r.getpickupDate(customerID);
            System.out.println("You use the car for "+days+" day(s).\n");
            System.out.println("You are supposed to pay: "+days * r.getCar(c,r.getcarID(customerID)).getPrice()+" dollar(s)");
            r.changePaid(customerID);
            System.out.println("Transaction succeed!!!");
            
        }else if(pay == "n" && dateToday > r.getdueDate(customerID)){
            System.out.println("You are late for payment! Give me all your money! right now!!!");
        }else if(pay == "n"){
            
        }
        
        else{
            System.out.println("You are late for payment! Give me all your money!");
        }
    }
    
    
    
           
}
