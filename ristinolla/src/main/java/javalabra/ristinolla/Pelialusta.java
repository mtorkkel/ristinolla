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
public class Pelialusta {

    private int[][] Pelialusta = new int[3][3];

    public Pelialusta() {
        tyhjennaPelialusta();
    }

    public void tyhjennaPelialusta() {
        for (int rivi = 0; rivi < 3; rivi++) {
            for (int sarake = 0; sarake < 3; sarake++) {
                Pelialusta[rivi][sarake] = 0;
            }
        }
    }

    public void teePelialusta() {
        System.out.println();
        for (int rivi = 0; rivi < 3; rivi++) {
            for (int sarake = 0; sarake < 3; sarake++) {
                if (Pelialusta[rivi][sarake] == -1) {
                    System.out.print("X");
                }
                if (Pelialusta[rivi][sarake] == 1) {
                    System.out.print("O");
                }
                if (Pelialusta[rivi][sarake] == 0) {
                    System.out.print(" ");
                }
//                if(sarake == 0 ) || sarake == 1) {
//                System.out.print("|");
//            }
                System.out.println();
            }
        }
    }

    public int naytaArvo(int[] arvo) {
        return Pelialusta[arvo[0]][arvo[1]]; 
//        rivi on nolla ja sarake on yksi
    }

    public void asetaArvo(int[] arvo, int pelaaja) {
        if (pelaaja == 1) {
            Pelialusta[arvo[0]][arvo[1]] = -1;
        } else {
            Pelialusta[arvo[0]][arvo[1]] = 1;
        }
    }

    public int tarkistaRivit() {
        for (int rivi = 0; rivi < 3; rivi++) {
            if ((Pelialusta[rivi][0] + Pelialusta[rivi][1] + Pelialusta[rivi][2]) == -3) {
                return -1;
            }
            if ((Pelialusta[rivi][0] + Pelialusta[rivi][1] + Pelialusta[rivi][2]) == 3) {
                return 1;
            }

        }
        return 0;
    }

    public int tarkistaSarakkeet() {
        for (int sarake = 0; sarake < 3; sarake++) {
            if ((Pelialusta[0][sarake] + Pelialusta[1][sarake] + Pelialusta[2][sarake]) == -3) {
                return -1;
            }
            if ((Pelialusta[0][sarake] + Pelialusta[1][sarake] + Pelialusta[2][sarake]) == 3) {
                return 1;
            }
        }
        return 0;
    }

    public int tarkistaDiagonaalit() {
        if ((Pelialusta[0][0] + Pelialusta[1][1] + Pelialusta[2][2]) == -3) {
            return -1;
        }
        if ((Pelialusta[0][0] + Pelialusta[1][1] + Pelialusta[2][2]) == 3) {
            return 1;
        }
        if ((Pelialusta[0][2] + Pelialusta[1][1] + Pelialusta[2][0]) == -3) {
            return -1;
        }
        if ((Pelialusta[0][2] + Pelialusta[1][1] + Pelialusta[2][0]) == 3) {
            return 1;
        }

        return 0;

    }

    public boolean taysiPelialusta() {
        for (int rivi = 0; rivi < 3; rivi++) {
            for (int sarake = 0; sarake < 3; sarake++) {
                if (Pelialusta[rivi][sarake] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
