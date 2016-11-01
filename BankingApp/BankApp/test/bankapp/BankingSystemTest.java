/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yubai
 */
public class BankingSystemTest {
    
    public BankingSystemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of add method, of class BankingSystem.
     */
    @Test
    public void testAdd() {
        System.out.println("* BankintSystemTest: TestAdd");
        BankingSystem sys = new BankingSystem();
        assertEquals(0, sys.accounts.size());
        sys.add(new BankAccount("YuguanBai", 1432324));
        assertEquals("YuguanBai", sys.accounts.get(0).getName());
        assertEquals(1432324, (int) sys.accounts.get(0).getBalance());
        sys.add(new BankAccount("TonyBrook", 112));
        assertEquals("TonyBrook", sys.accounts.get(1).getName());
        assertEquals(112, (int) sys.accounts.get(1).getBalance());
        sys.add(new BankAccount("MikaDon", 1422));
        assertEquals("MikaDon", sys.accounts.get(2).getName());
        assertEquals(1422, (int) sys.accounts.get(2).getBalance());
        sys.add(new BankAccount("TockTick", 1314521));
        assertEquals("TockTick", sys.accounts.get(3).getName());
        assertEquals(1314521, (int) sys.accounts.get(3).getBalance());
        
    }

    /**
     * Test of sortByNameAscending method, of class BankingSystem.
     */
    @Test
    public void testSortByNameAscending() {
        System.out.println("* BankintSystemTest: TestSortByNameAscending");
        BankingSystem sys = new BankingSystem();
        
        sys.add(new BankAccount("YuguanBai", 1432324));
        sys.add(new BankAccount("TonyBrook", 112));
        sys.add(new BankAccount("MikaDon", 1422));
        sys.add(new BankAccount("TockTick", 1314521));
        sys.sortByNameAscending();
        assertEquals("MikaDon", sys.accounts.get(0).getName());
        assertEquals("TockTick", sys.accounts.get(1).getName());
        assertEquals("TonyBrook", sys.accounts.get(2).getName());
        assertEquals("YuguanBai", sys.accounts.get(3).getName());
        
        
    }

    /**
     * Test of sortByBalanceAscending method, of class BankingSystem.
     */
    @Test
    public void testSortByBalanceAscending() {
        System.out.println("* BankintSystemTest: TestSortByBalanceAscending");
        BankingSystem sys = new BankingSystem();
        
        sys.add(new BankAccount("YuguanBai", 1432324));
        sys.add(new BankAccount("TonyBrook", 112));
        sys.add(new BankAccount("MikaDon", 1422));
        sys.add(new BankAccount("TockTick", 1314521));
        sys.sortByBalanceAscending();
        assertEquals(112, (int) sys.accounts.get(0).getBalance());
        assertEquals(1422, (int) sys.accounts.get(1).getBalance());
        assertEquals(1314521, (int) sys.accounts.get(2).getBalance());
        assertEquals(1432324, (int) sys.accounts.get(3).getBalance());
    }
    
}
