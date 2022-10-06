package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    public void Constructor() {
        this.fraction = new Fraction(10, 20);
    }

    @Test
    void testEmptyConstructor() {
        Fraction fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testGetNumerator() {
        assertEquals(10, this.fraction.getNumerator());
    }

    @Test
    void testSetNumerator() {
        this.fraction.setNumerator(100);
        assertEquals(100, this.fraction.getNumerator());
    }

    @Test
    void testGetDenominator() {
        assertEquals(20, this.fraction.getDenominator());
    }

    @Test
    void testSetDenominator() {
        this.fraction.setDenominator(200);
        assertEquals(200, this.fraction.getDenominator());
    }

    @Test
    void testDecimal() {
        assertEquals(0.5, this.fraction.decimal());
    }

    @Test
    void testToString() {
        String fractionTest = "Fraction{numerator=10, denominator=20}";
        assertEquals(fractionTest, fraction.toString());
    }

    @Test
    void testIsProper() {
        assertTrue(this.fraction.isProper());
    }

    @Test
    void testIsImproper() {
        assertFalse(this.fraction.isImproper());
    }

    @Test
    void testIsEquivalent() {
        Fraction fractionTest = new Fraction(10, 20);
        assertTrue(this.fraction.isEquivalent(fractionTest));
    }

    @Test
    void testAdd() {
        Fraction fractionTest = new Fraction(10, 20);
        assertEquals(400, this.fraction.add(fractionTest).getNumerator());
        assertEquals(400, this.fraction.add(fractionTest).getDenominator());
    }

    @Test
    void testMultiply() {
        Fraction fractionTest = new Fraction(10, 20);
        assertEquals(100, this.fraction.multiply(fractionTest).getNumerator());
        assertEquals(400, this.fraction.multiply(fractionTest).getDenominator());
    }

    @Test
    void testDivide() {
        Fraction fractionTest = new Fraction(10, 20);
        assertEquals(200, this.fraction.divide(fractionTest).getNumerator());
        assertEquals(200, this.fraction.divide(fractionTest).getDenominator());
    }

    @Test
    void testReduce() {
        assertEquals(1, this.fraction.reduce().getNumerator());
        assertEquals(2, this.fraction.reduce().getDenominator());
    }

    @Test
    void testIsLegal() {
        Fraction fractionTest = new Fraction(1, 0);
        assertFalse(fractionTest.isLegal());
    }
}
