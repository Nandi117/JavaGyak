import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HaromszogTest {

    @Test
    void oldalhossz_bc(){
        try {
            Haromszog hsz1 = new Haromszog(3,4,5);
            assertTrue(hsz1.getB() < hsz1.getC());
            assertTrue(hsz1.getA() < hsz1.getC());
            assertTrue(hsz1.getA() < hsz1.getB());
        } catch (HaromszogException e) {
            fail("a b oldal hosszabb, mint a c oldal");
        }
    }

    @Test
    void szog_90(){
        try {
            Haromszog hsz1 = new Haromszog(3,4,5);
            assertEquals(Math.PI / 2, hsz1.getGamma());
        } catch (HaromszogException e) {
            fail("kivetel");
        }
    }

    @Test
    void szog_60(){
        try {
            double delta = 0.0001;
            Haromszog hsz1 = new Haromszog(3,3,3);
            assertEquals(Math.PI / 3, hsz1.getGamma(), delta);
            assertEquals(Math.PI / 3, hsz1.getBeta(), delta);
            assertEquals(Math.PI / 3, hsz1.getAlfa(), delta);
        } catch (HaromszogException e) {
            fail("kivetel");
        }
    }

    @Test
    void oldalhossz_negativ(){
        assertThrowsExactly(HaromszogException.class, () -> new Haromszog(-3,4,5));
    }

    @Test
    void getA() {
        try {
            Haromszog hsz1 = new Haromszog(3,4,5);
            assertEquals(3, hsz1.getA());
        } catch (HaromszogException e) {
            fail("kivetel");
        }
    }
}