package greeter;

/**
   A class for producing simple greetings.
   @author Yuguan Bai
*/

public class Greeter
{
   /**
      Constructs a Greeter object that can greet a person or 
      entity.
      @param aName the name of the person or entity who should
      be addressed in the greetings.
   */
   public Greeter(String aName)
   {
      name = aName;
   }
   
   /**
    * Set the value of the variable name in a Greeter object.
    * @param aName the name of the person or entity whose name shall that should
    * be stored in variable name.
    */

   public void setName(String aName){
      name = aName;
   }
   
   /**
      Greet with a "Hello" message.
      @return a message containing "Hello" and the name of
      the greeted person or entity.
   */
   public String sayHello()
   {
      return "Hello, " + name + "!";
   }
   
   /**
    * Return the string in variable name of a Greeter object.
    * @return the name of the person to be greeted.
    */
   public String expName(){
       return name;
   }

   private String name;
}
