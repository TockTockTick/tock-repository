/**
 * The class for country
 * @author Yuguan Bai
 */
package country;

import java.util.Comparator;
/**
   A country with a name and area.
*/
public class Country
{
   /**
      Constructs a country.
      @param aName the name of the country
      @param anArea the area of the country
   */
   public Country(String aName, double anArea)
   {
      name = aName;
      area = anArea;
   }

   /**
      Gets the name of the country.
      @return the name
   */
   public String getName()
   {
      return name;
   }

   /**
      Gets the area of the country.
      @return the area
   */
   public double getArea()
   {
      return area;
   }
   
   
   /**
    *Comparator that sorts the by name
    * @param increasing a parameter of boolean type, used to toggle between descending
    * and ascending order
    * @return  a new Comparator for Country objects
    */
   public static Comparator<Country> createComparatorByName(final boolean increasing){
       return new Comparator<Country>(){
           public int compare(Country coun1, Country coun2){
               int whoLar;
               whoLar = coun1.getName().compareTo(coun2.getName());
               System.out.println(coun1.getName()+" X "+coun2.getName());
               System.out.println(whoLar);
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
   
   
   /**
    * Comparator that sorts by area
    * @param increasing a parameter of boolean type, used to toggle between descending\
    * and ascending order
    * @return 
    */
   public static Comparator<Country> createComparatorByArea(final boolean increasing){
       return new Comparator<Country>(){
           public int compare(Country coun1, Country coun2){
               boolean whoLar;
               whoLar = (coun1.getArea() < coun2.getArea());
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
   
   

   private String name;
   private double area;

    
}
