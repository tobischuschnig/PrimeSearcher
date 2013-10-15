/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primesearcher;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tobi
 */
public class PrimeSearcherTest {
    
    public PrimeSearcherTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of run method, of class PrimeSearcher.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        PrimeSearcher instance = new PrimeSearcher();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculate method, of class PrimeSearcher.
     */
    @Test
    public void testCalculate() {
        System.out.println("calculate");
        PrimeSearcher instance = new PrimeSearcher();
        boolean expResult = false;
        boolean result = instance.calculate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrime method, of class PrimeSearcher.
     */
    @Test
    public void testGetPrime() {
        System.out.println("getPrime");
        PrimeSearcher instance = new PrimeSearcher();
        int expResult = 0;
        int result = instance.getPrime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastTime method, of class PrimeSearcher.
     */
    @Test
    public void testGetLastTime() {
        System.out.println("getLastTime");
        PrimeSearcher instance = new PrimeSearcher();
        Date expResult = null;
        Date result = instance.getLastTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBeginnTime method, of class PrimeSearcher.
     */
    @Test
    public void testGetBeginnTime() {
        System.out.println("getBeginnTime");
        PrimeSearcher instance = new PrimeSearcher();
        Date expResult = null;
        Date result = instance.getBeginnTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}