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
}
