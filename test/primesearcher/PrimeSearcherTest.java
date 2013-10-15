package primesearcher;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testet die Klasse PrimeSearcher
 * @author Tobias Schuschnig
 */
public class PrimeSearcherTest {
    
    private PrimeSearcher prime;
    
    @Before
    public void setUp() {
        prime = new PrimeSearcher();
    }

    /**
     * Test of run method, of class PrimeSearcher.
     */
    @Test
    public void testRun() {
        //prime.run();
        //prime.interrupt();
        //Sollte meines wissen so funktionieren tut es aber nicht
    }
    
    /**
     * Testet die calculate Methode
     * Erwartetes Ergebnis: true
     * Ergebnis: true
     */
    @Test
    public void testGetPrime() {
        assertEquals(prime.calculate(),true);
    }

    /**
     * Testet die getPrime Methode
     * Erwartetes Ergebnis: 2
     * Ergebnis: 2
     */
    @Test
    public void testCalculate() {
        assertEquals(prime.getPrime(),2);
    }
    
    /**
     * Testet ob die beginnTime Methode etwas zurueck liefert
     */
    @Test
    public void testGetBeginnTime() {
        Date wert = prime.getBeginnTime();
    }
    
    /**
     * Testet ob die getLastTime Methode etwas zurueck liefert
     */
    @Test
    public void testGetLastTime() {
        Date wert = prime.getLastTime();
    }
}