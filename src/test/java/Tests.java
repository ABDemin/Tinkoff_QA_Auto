import org.junit.*;
import static org.junit.Assert.*;

public class Tests {
    @Test
    public void testStandardConstructor() {
        Rational standard = new Rational();
        assertEquals("Standard constructor returns wrong numerator", 0, standard.getNumerator());
        assertEquals("Standard constructor returns wrong denominator", 1, standard.getDenominator());
    }
    @Test
    public void testCreatRational() {
        Rational s = new Rational(-1, 2);
        assertEquals(-1, s.getNumerator());
        assertEquals(2, s.getDenominator());
    }
    @Test
    public void testMultiply() {
        Rational s = new Rational(1,2).multiply(new Rational(1, 3));
        assertEquals(1, s.getNumerator());
        assertEquals(6, s.getDenominator());
    }
}