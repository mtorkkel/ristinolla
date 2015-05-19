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
        pelialusta.tyhjennaPelialusta();
        assertEquals("Pelialustan ruuduissa on 0", pelialusta.tyhjennaPelialusta());
    }

    @Test
    public void nayttaaArvon() {
        pelialusta.naytaArvo(arvo);
        assertEquals("Ruudussa on 0, X tai O.", pelialusta.naytaArvo(arvo));

    }
}
