package javalabra.ristinolla;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javalabra.ristinolla.Pelialusta;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author mtorkkel
 */
public class PelialustaTest {

    Pelialusta pelialusta;

    public PelialustaTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        pelialusta = new Pelialusta();
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void tyhjentaaPelialustan() {
        for (int rivi = 0; rivi < 3; rivi++) {
            for (int sarake = 0; sarake < 3; sarake++) {
                assertEquals(0, pelialusta.naytaArvo(rivi, sarake));
            }
        }
    }

    @Test
    public void tekeePelialustan() {
        for (int rivi = 0; rivi < 3; rivi++) {
            for (int sarake = 0; sarake < 3; sarake++) {
                if (pelialusta.naytaArvo(rivi, sarake) == -1) {
                    assertEquals("X", pelialusta.naytaArvo(rivi, sarake));
                }
            }
        }
    }

    @Test
    public void asettaaArvon() {
        pelialusta.asetaArvo(0, 1, 1);
        assertEquals(-1, pelialusta.naytaArvo(0, 1));
    }

    @Test
    public void tarkistaaRivit() {
        for (int rivi = 0; rivi < 3; rivi++) {
            if (pelialusta.naytaArvo(rivi, rivi) == -3) {
                assertEquals(-1, pelialusta.tarkistaRivit());
            }

        }
    }

    @Test
    public void tarkistaaSarakkeet() {
        for (int sarake = 0; sarake < 3; sarake++) {
            if (pelialusta.naytaArvo(sarake, sarake) == 3) {
                assertEquals(1, pelialusta.tarkistaSarakkeet());
            }
        }
    }

    @Test
    public void tarkistaaDiagonaalit() {
        pelialusta.asetaArvo(0, 0, -1);
        pelialusta.asetaArvo(1, 1, -1);
        pelialusta.asetaArvo(2, 2, -1);
        assertEquals(1, pelialusta.tarkistaDiagonaalit());
    }

    @Test
    public void onkoPelialustaTaysi() {
        for (int rivi = 0; rivi < 3; rivi++) {
            for (int sarake = 0; sarake < 3; sarake++) {
                if (pelialusta.naytaArvo(rivi, sarake) == 0) {
                    assertEquals(0, pelialusta.naytaArvo(rivi, sarake));
                }

            }
        }
    }

    @Test
    public void asettaaArvoja() {
        pelialusta.asetaArvo(2, 2, -1);
        assertEquals(1, pelialusta.naytaArvo(2, 2));
    }

    @Test
    public void tarkistaaRiveja() {
        for (int rivi = 0; rivi < 3; rivi++) {
            if (pelialusta.naytaArvo(rivi, rivi) == 3) {
                assertEquals(1, pelialusta.tarkistaRivit());
            }

        }
    }

    @Test
    public void tekeePelialustaa() {
        for (int rivi = 0; rivi < 3; rivi++) {
            for (int sarake = 0; sarake < 3; sarake++) {
                if (pelialusta.naytaArvo(rivi, sarake) == 0) {
                    assertEquals(0, pelialusta.naytaArvo(rivi, sarake));
                }
            }
        }
    }
}
