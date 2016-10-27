/*
 *A JUnit test to for Country class
 *@author Yuguan Bai
 */
package country;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yubai
 */
public class CountryTest {
    
    public CountryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class Country.
     */
    @Test
    public void testGetName() {
        System.out.println("* CountryTest: TestGetName()");
        
        
        ArrayList<Country> countries = new ArrayList<Country>();
        Collections.sort(countries, Country.createComparatorByName(true));
        assertEquals("Uruguay",(new Country("Uruguay", 176220)).getName());
        assertEquals("Thailand",(new Country("Thailand", 514000)).getName());
        assertEquals("LSJ",(new Country("LSJ", 2493)).getName());
        assertEquals("Dsoe",(new Country("Dsoe", 523012)).getName());
        assertEquals("Chinialagada",(new Country("Chinialagada", 1)).getName());
        assertEquals("Belgium", new Country("Belgium", 30510).getName());
    }

    /**
     * Test of getArea method, of class Country.
     */
    @Test
    public void testGetArea() {
        System.out.println("* CountryTest: TestGetArea()");
        
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(new Country("Uruguay", 176220));
        countries.add(new Country("Thailand", 514000));
        countries.add(new Country("Belgium", 30510));
        countries.add(new Country("Dsoe", 523012));
        countries.add((new Country("LSJ", 2493)));
        countries.add(new Country("Chinialagada", 1));
        
        
    }

    /**
     * Test of createComparatorByName method, of class Country.
     */
    @Test
    public void testCreateComparatorByName() {
        System.out.println("* CountryTest: TestGetName()");
        
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(new Country("Uruguay", 176220));
        countries.add(new Country("Thailand", 514000));
        countries.add(new Country("Belgium", 30510));
        countries.add(new Country("Dsoe", 523012));
        countries.add((new Country("LSJ", 2493)));
        countries.add(new Country("Chinialagada", 1));
        
        Collections.sort(countries, Country.createComparatorByName(true));
        assertEquals("Uruguay",countries.get(0).getName());
        assertEquals("Thailand",countries.get(1).getName());
        assertEquals("LSJ",countries.get(2).getName());
        assertEquals("Dsoe",countries.get(3).getName());
        assertEquals("Chinialagada",countries.get(4).getName());
        assertEquals("Belgium",countries.get(5).getName());
    }

    /**
     * Test of createComparatorByArea method, of class Country.
     */
    @Test
    public void testCreateComparatorByArea() {
        
        System.out.println("* CountryTest: TestGetComparatorByArea()");
        
        ArrayList<Country> countries = new ArrayList<Country>();
        countries.add(new Country("Uruguay", 176220));
        countries.add(new Country("Thailand", 514000));
        countries.add(new Country("Belgium", 30510));
        countries.add(new Country("Dsoe", 523012));
        countries.add((new Country("LSJ", 2493)));
        countries.add(new Country("Chinialagada", 1));
        
        Collections.sort(countries, Country.createComparatorByArea(true));
        assertEquals(523012,(int)countries.get(0).getArea());
        assertEquals(514000,(int)countries.get(1).getArea());
        assertEquals(176220,(int)countries.get(2).getArea());
        assertEquals(30510,(int)countries.get(3).getArea());
        assertEquals(2493,(int)countries.get(4).getArea());
        assertEquals(1,(int)countries.get(5).getArea());
        
        
        
        
    }
    
}
