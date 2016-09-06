package greeter;

/**
 * A tester class that test the functions of Greeter class.
 * @author yubai
 */
public class GreeterApp {

    /**
     * First test the setName method and sayHello method, secondly test the 
     * swapNames method.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TEST ONE:
        //Declare Greeter object greet1 and greet2 that refers to same object.
        Greeter greet1 = new Greeter("Sir A");
        Greeter greet2 = greet1;
        //Set the name of greet1 to "YB".
        greet1.setName("YB");
        //Apply function sayHello() to greet2 and print out the result.
        System.out.println(greet2.sayHello());
        System.out.println();
        
        //TEST TWO:
        //Declare Greeter objects greet3 and greet4.
        Greeter greet3 = new Greeter ("Sir C");
        Greeter greet4 = new Greeter ("Sir D");
        //Print out the names of greet3 and greet4.
        System.out.println("greet3: " + greet3.sayHello());
        System.out.println("greet4: " + greet4.sayHello());
        //Apply method swapNames to greet3 and greet4.
        System.out.println("Swap greet3 and greet4.");
        swapNames(greet3, greet4);
        //Print out the names of greet3 and greet4.
        System.out.println("greet3: " + greet3.sayHello());
        System.out.println("greet4: " + greet4.sayHello());
        
    }
    
    /**
     * Exchange the names in greet1 and greet2.
     * @param great1 The Greeter object that stores the first name.
     * @param great2 The Greeter object that stores another name.
     */
    public static void swapNames(Greeter great1, Greeter great2) {
        //Create a variable storge to store the name.
        String storge;
        //The process of exchanging names between great1 and great2.
        storge = great1.expName();
        great1.setName(great2.expName());
        great2.setName(storge);
    }
    
}
