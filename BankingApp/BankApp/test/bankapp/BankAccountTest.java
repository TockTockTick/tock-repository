/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

import java.util.Comparator;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author yubai
 */
public class BankAccountTest {
    
    public BankAccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class BankAccount.
     */
    @Test
    public void testGetName() {
        System.out.println("* BankAccountTest: TestGetName()");
        assertEquals("YuguanBai", (new BankAccount("YuguanBai", 1432324)).getName());
        assertEquals("TonyBrook", (new BankAccount("TonyBrook", 112)).getName());
        assertEquals("MikaDon", (new BankAccount("MikaDon", 1422)).getName());
        assertEquals("TockTick", (new BankAccount("TockTick", 1314521)).getName());
        
    }

    /**
     * Test of getBalance method, of class BankAccount.
     */
    @Test
    public void testGetBalance() {
        System.out.println("* BankAccountTest: TestGetBalance()");
        assertEquals(1432324, (int) (new BankAccount("YuguanBai", 1432324)).getBalance());
        assertEquals(112, (int) (new BankAccount("TonyBrook", 112)).getBalance());
        assertEquals(1422, (int) (new BankAccount("MikaDon", 1422)).getBalance());
        assertEquals(1314521, (int) (new BankAccount("TockTick", 1314521)).getBalance());
    }

    /**
     * Test of createComparatorByBalance method, of class BankAccount.
     */
    @Test
    public void testCreateComparatorByBalance() {
        System.out.println("* BankAccountTest: TestGetComparatorByBalance");
        ArrayList<BankAccount> acc = new ArrayList<BankAccount>();
        acc.add(new BankAccount("YuguanBai", 1432324));
        acc.add(new BankAccount("TonyBrook", 112));
        acc.add(new BankAccount("MikaDon", 1422));
        acc.add(new BankAccount("TockTick", 1314521));
        Collections.sort(acc, BankAccount.createComparatorByBalance(false));
        assertEquals(112, (int) acc.get(0).getBalance());
        assertEquals(1422, (int) acc.get(1).getBalance());
        assertEquals(1314521, (int) acc.get(2).getBalance());
        assertEquals(1432324, (int) acc.get(3).getBalance());
    }

    /**
     * Test of createComparatorByName method, of class BankAccount.
     */
    @Test
    public void testCreateComparatorByName() {
        System.out.println("* BankAccountTest: TestGetComparatorByName");
        ArrayList<BankAccount> acc = new ArrayList<BankAccount>();
        acc.add(new BankAccount("YuguanBai", 1432324));
        acc.add(new BankAccount("TonyBrook", 112));
        acc.add(new BankAccount("MikaDon", 1422));
        acc.add(new BankAccount("TockTick", 1314521));
        Collections.sort(acc, BankAccount.createComparatorByName(false));
        assertEquals("MikaDon", acc.get(0).getName());
        assertEquals("TockTick", acc.get(1).getName());
        assertEquals("TonyBrook", acc.get(2).getName());
        assertEquals("YuguanBai", acc.get(3).getName());
    }
    
}
