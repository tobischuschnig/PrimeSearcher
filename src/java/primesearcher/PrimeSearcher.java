/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package primesearcher;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author tobi
 */
public class PrimeSearcher extends Thread{
    private ArrayList<Integer> primes;
    private Date btime;  //Beginn Time
    private Date ltime;   //Lezte gefundene Primzahl
    private int current;
    
    public PrimeSearcher() {
        primes = new ArrayList<Integer>();
        btime = Calendar.getInstance().getTime();
        primes.add(2);
        
    }
    
    
    @Override
    public void run() {
        
    }
    
    /**
     * Gibt die letzte berechnete Primzahl zurueck
     * @return letzte Primzahl
     */
    public int getPrime() {
        return primes.get(primes.size() - 1);
    }

    /**
     * Gibt die Zeit zurueck bei der zuletzt eine Primzahl gefunden wurde
     * @return Letzte Zeit
     */
    public Date getLastTime() {
        return ltime;
    }
    
    /**
     * Gibt die Beginn Zeit zurueck
     * @return Beginn Zeit
     */
    public Date getBeginnTime() {
        return btime;
    }
}
