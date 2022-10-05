package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    public void Constructor(){
        this.fraction = new Fraction(10,20);
    }

    @Test
    void testEmptyConstructor(){
        Fraction fraction = new Fraction();
        assertEquals(1, fraction.getNumerator());
        assertEquals(1, fraction.getDenominator());
    }

    @Test
    void testGetNumerator(){
        assertEquals(10, this.fraction.getNumerator());
    }

    @Test
    void testSetNumerator(){
        this.fraction.setNumerator(100);
        assertEquals(100, this.fraction.getNumerator());
    }

    @Test
    void testGetDenominator(){
        assertEquals(20, this.fraction.getDenominator());
    }

    @Test
    void testSetDenominator(){
        this.fraction.setDenominator(200);
        assertEquals(200, this.fraction.getDenominator());
    }

    @Test
    void testDecimal(){
        assertEquals(0.5, this.fraction.decimal());
    }

    @Test
    void testToString(){
        String fractionTest = "Fraction{numerator=10, denominator=20}";
        assertEquals(fractionTest, fraction.toString());
    }
}
