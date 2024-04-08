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
    public void testCreateRational() {
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
    @Test
    public void testEquals() {
        boolean equals = new Rational(1, 2).equals(new Rational(1,2));
        assertTrue("Not equal", equals);
    }
    @Test
    public void testLess() {
        boolean less = new Rational(1,3).less(new Rational(1,2));
        assertTrue(less);
    }
    @Test
    public void testLessOrEqual() {
        boolean less = new Rational(1,3).lessOrEqual(new Rational(1,2));
        assertTrue(less);
        boolean equal = new Rational(1,2).lessOrEqual(new Rational(1,2));
        assertTrue(equal);
    }
    @Test
    public void testPlus() {
        Rational plus = new Rational(1,2).plus(new Rational(1,3));
        assertEquals(5, plus.getNumerator());
        assertEquals(6, plus.getDenominator());
    }
    /*comment*/
    @Test public void testMinus() {
        Rational minus = new Rational(1,2).minus(new Rational(1,3));
        assertEquals(1, minus.getNumerator());
        assertEquals(6, minus.getDenominator());
    }
}