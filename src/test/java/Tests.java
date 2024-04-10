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
    public void testConstructor() {
        //testing positive numerator and positive denominator with maximum int number:
        Rational constructPnPd = new Rational(1, 2147483647);
        assertEquals("Constructor returns wrong numerator",1, constructPnPd.getNumerator());
        assertEquals("Constructor returns wrong denominator",2147483647, constructPnPd.getDenominator());

        //testing negative numerator with minimum int number and negative denominator, result - maximum int number:
        Rational constructNnNd = new Rational(-2147483647, -1);
        assertEquals("Constructor returns wrong numerator",2147483647, constructNnNd.getNumerator());
        assertEquals("Constructor returns wrong denominator",1, constructNnNd.getDenominator());

        //testing positive numerator and negative denominator, transition of minus to numerator, fraction reduction:
        Rational constructPnNd = new Rational(2, -4);
        assertEquals("Constructor returns wrong numerator",-1, constructPnNd.getNumerator());
        assertEquals("Constructor returns wrong denominator",2, constructPnNd.getDenominator());

        //testing negative numerator and positive denominator, result - minimum int number
        Rational constructNnPd = new Rational(-2147483647, 1);
        assertEquals("Constructor returns wrong numerator",-2147483647, constructNnPd.getNumerator());
        assertEquals("Constructor returns wrong denominator",1, constructNnPd.getDenominator());

        //testing zero numerator and positive denominator:
        Rational constructZnPd = new Rational(0, 2);
        assertEquals("Constructor returns wrong numerator",0, constructZnPd.getNumerator());
        assertEquals("Constructor returns wrong denominator",1, constructZnPd.getDenominator());

        //testing zero numerator and negative denominator:
        Rational constructZnNd = new Rational(0, -2);
        assertEquals("Constructor returns wrong numerator",0, constructZnNd.getNumerator());
        assertEquals("Constructor returns wrong denominator",1, constructZnNd.getDenominator());
    }
    @Test(expected = ArithmeticException.class)
    //testing constructor with zero denominator
    public void testZeroDenominator() {
        new Rational(1,0);
    }
    @Test
    public void testMultiply() {
        //testing multiplication with positive a and positive b fractions:
        Rational multiplyPaPb = new Rational(1,2).multiply(new Rational(1, 3));
        assertEquals("Constructor returns wrong numerator",1, multiplyPaPb.getNumerator());
        assertEquals("Constructor returns wrong denominator",6, multiplyPaPb.getDenominator());

        //testing multiplication with negative a and negative b fractions:
        Rational multiplyNaNb = new Rational(-1,2).multiply(new Rational(1, -3));
        assertEquals("Constructor returns wrong numerator",1, multiplyNaNb.getNumerator());
        assertEquals("Constructor returns wrong denominator",6, multiplyNaNb.getDenominator());

        //testing multiplication with positive a and negative b fractions:
        Rational multiplyPaNb = new Rational(1,2).multiply(new Rational(1, -3));
        assertEquals("Constructor returns wrong numerator",-1, multiplyPaNb.getNumerator());
        assertEquals("Constructor returns wrong denominator",6, multiplyPaNb.getDenominator());

        //testing multiplication fraction times zero:
        Rational multiplyFractionXZero = new Rational(1,2).multiply(new Rational());
        assertEquals("Constructor returns wrong numerator",0, multiplyFractionXZero.getNumerator());
        assertEquals("Constructor returns wrong denominator",1, multiplyFractionXZero.getDenominator());
    }
    @Test(expected = ArithmeticException.class)
    //testing division by zero
    public void testDivisionZeroDenominator() {
        new Rational(1,2).multiply(new Rational(1,0));
    }
    @Test
    public void testPlus() {
        //testing plus
        Rational plus = new Rational(1,2).plus(new Rational(1,3));
        assertEquals("Constructor returns wrong numerator",5, plus.getNumerator());
        assertEquals("Constructor returns wrong denominator",6, plus.getDenominator());

        //testing plus zero
        Rational plusZero = new Rational(1,2).plus(new Rational());
        assertEquals("Constructor returns wrong numerator",1, plusZero.getNumerator());
        assertEquals("Constructor returns wrong denominator",2, plusZero.getDenominator());
    }
    @Test public void testMinus() {
        //testing minus
        Rational minus = new Rational(1,2).minus(new Rational(1,3));
        assertEquals("Constructor returns wrong numerator",1, minus.getNumerator());
        assertEquals("Constructor returns wrong denominator",6, minus.getDenominator());

        //testing minus zero
        Rational minusZero = new Rational(1,2).minus(new Rational());
        assertEquals("Constructor returns wrong numerator",1, minusZero.getNumerator());
        assertEquals("Constructor returns wrong denominator",2, minusZero.getDenominator());
    }
    @Test
    public void testEquals() {
        //testing positive fractions:
        assertTrue("Fractions are not equal",new Rational(1, 2).equals(new Rational(1,2)));

        //testing negative fractions:
        assertTrue("Fractions are not equal",new Rational(-1, 2).equals(new Rational(1,-2)));

        //testing zeros
        assertTrue("Fractions are not equal",new Rational().equals(new Rational()));

    }
    /*@Test
    public void testLess() {
        
    }
    @Test
    public void testLessOrEqual() {
        assertTrue(new Rational(1,3).lessOrEqual(new Rational(1,2)));
        assertTrue(new Rational(1,2).lessOrEqual(new Rational(1,2)));
    }*/
}