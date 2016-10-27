/**
 * A tester class for functionalities of Country
 * @author Yuguan Bai
 */
package country;

import java.util.*;

public class CountrySortTester
{
   public static void main(String[] args)
   {
      
       ArrayList<Country> countries = new ArrayList<Country>();
      countries.add(new Country("Uruguay", 176220));
      countries.add(new Country("Thailand", 514000));
      countries.add(new Country("Belgium", 30510));
      countries.add(new Country("Dsoe", 523012));
      countries.add((new Country("LSJ", 2493)));

      
      
      
      
      Collections.sort(countries, Country.createComparatorByName(true));
      System.out.println("Descending name::");
      // Now the array list is sorted by area
      for (Country c : countries)
         System.out.println(c.getName() + " " + c.getArea());
         System.out.println();
         
         
         Collections.sort(countries, Country.createComparatorByName(false));
      System.out.println("Ascending name::");
      // Now the array list is sorted by area
      for (Country c : countries)
         System.out.println(c.getName() + " " + c.getArea());
         System.out.println();
      
         
      
      Collections.sort(countries, Country.createComparatorByArea(true));
      System.out.println("Descending area::");
      // Now the array list is sorted by area
      for (Country c : countries)
         System.out.println(c.getName() + " " + c.getArea());
         System.out.println();
      
      
      
      
      Collections.sort(countries, Country.createComparatorByArea(false));
      System.out.println("Ascending area::");
      // Now the array list is sorted by area
      for (Country c : countries)
         System.out.println(c.getName() + " " + c.getArea());
         System.out.println();
      
   }
   
}
