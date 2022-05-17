package teste;

import clase.Matematica;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatematicaTest {

    public Matematica matematica;

    @Before
    public void setUp(){
        matematica= Matematica.getInstance();
       // System.out.println("am trecut pe aici");
    }


    @Test
    public void testSumaCorecta()
    {
        int rezultatObtinut= matematica.suma(7,5);
        //fail("test");
        assertEquals(12, rezultatObtinut);
    }

    @Test
    public void testRaportCorect(){
        double rezultatObtinut= matematica.raport(24,11);
        assertEquals(2.1818, rezultatObtinut,0.00005);
    }

    @Test
    public void testRaportCorect2(){
        double rezultatObtinut= matematica.raport(24,11);
        assertEquals(2.1818, rezultatObtinut,0.00005);
    }

    @Test
    public void testRaportCorect3(){
        double rezultatObtinut= matematica.raport(-24,2);
        assertEquals(-12, rezultatObtinut,0.00005);
    }

    @Test
    public  void testRaportCuZero() {
        try {
            matematica.raport(57,0);
            fail("nu trebuia sa ajunga aici");
        }catch (IllegalArgumentException ert){

        }
    }

    @Test (expected = IllegalArgumentException.class)
    public void testRaportShouldThrowException(){
        matematica.raport(23,0);
    }

    @Test
    public void testParitate(){
        boolean rezultat=matematica.estePar(5);
        assertFalse(rezultat);
        assertTrue(matematica.estePar(4));
        assertFalse(matematica.estePar(3));

    }

    @Test
    public void testNumerePare(){
        assertEquals(4, matematica.nNumerePare(4));
        assertEquals(44, matematica.nNumerePare(44));
        assertEquals(1, matematica.nNumerePare(1));

    }

    @Test
    public void testNumereParePeZero(){
        assertNull(matematica.nNumerePare(0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllegalnNumerePareNrNegative(){
        matematica.nNumerePare(-3);
    }

    @Test
    public void testSingleton(){
        assertSame(Matematica.getInstance(), Matematica.getInstance());
    }

    @Test
    public void testRaportSingleton(){
        assertEquals(1,matematica.raport(2,2),0.0001);
    }



}