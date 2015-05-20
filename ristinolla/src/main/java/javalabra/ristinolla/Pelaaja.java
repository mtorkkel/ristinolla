/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabra.ristinolla;

/**
 *
 * @author mtorkkel
 */
public abstract class Pelaaja {

    protected int[] yritys = new int[2];
    protected int pelaaja;

    public Pelaaja(int pelaaja) {
        this.pelaaja = pelaaja;
    }

    public abstract void pelaa(Pelialusta pelialusta);

    public abstract void yrita(Pelialusta pelialusta);

  
}
