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
        current = 3;
    }
    
    
    @Override
    public void run() {
        while (!isInterrupted()) {
            if(calculate)
        }
    }
    
    /**
     * Berechnet ob es sich um eine Primzahl handelt
     * Code von:http://www.javafaq.nu/java-example-code-1025.html Author: 
     * Eingesehen: 14.10.2013
     * @return 
     */
    public boolean calculate() {
        long sqrt = (long) Math.sqrt(current);
        for (long i = 3; i <= sqrt; i += 2) {
            if (current % i == 0) return false;  //Wenn es keine Primzahl ist
        }
        //Wird nur erreicht wenn es sich um eine Primzahl handelt.
        return true;
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
