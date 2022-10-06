package es.upm.miw.iwvg_devops.code;

/**
 * Conceptos: Las fracciones propias son aquellas cuyo numerador es menor que el denominador
 * <p>
 * Las fracciones impropias son aquellas cuyo numerador es mayor que el denominador
 * <p>
 * Dos fracciones son equivalentes cuando el producto de extremos (numerador de la primera por denominador de la segunda) es igual al
 * producto de medios (denominador de la primera por el numerador de la segunda)
 * <p>
 * Las fracciones irreducibles son aquellas que no se pueden simplificar, esto sucede cuando el numerador y el denominador son primos entre
 * sí
 * <p>
 * Reducir varias fracciones a común denominador consiste en convertirlas en otras equivalentes que tengan el mismo denominador
 * <p>
 * Comparar fracciones
 * <p>
 * Suma fracciones: En primer lugar se reducen los denominadores a común denominador, y se suman o se restan los numeradores de las
 * fracciones equivalentes obtenidas
 * <p>
 * Multiplicación: La multiplicación de dos fracciones es otra fracción que tiene: Por numerador el producto de los numeradores. Por
 * denominador el producto de los denominadores.
 * <p>
 * La división de dos fracciones es otra fracción que tiene: Por numerador el producto de los extremos. Por denominador el producto de los
 * medios. Invertir fraccion
 */
public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public boolean isProper() {
        return numerator < denominator;
    }

    public boolean isImproper() {
        return numerator > denominator;
    }

    public boolean isEquivalent(Fraction fraction) {
        return numerator * fraction.denominator ==  denominator * fraction.numerator;
    }

    public Fraction add(Fraction fraction){
        int x;
        int y;

        x = (numerator * fraction.denominator) + (fraction.numerator * denominator);
        y =  denominator * fraction.denominator;
        return new Fraction(x,y);
    }

    public Fraction multiply(Fraction fraction) {
        int x;
        int y;

        x = numerator * fraction.numerator;
        y = denominator * fraction.denominator;
        return new Fraction(x, y);
    }

    public Fraction divide(Fraction fraction) {
        int x;
        int y;

        x = this.numerator * fraction.denominator;
        y = this.denominator * fraction.numerator;
        return new Fraction(x, y);
    }

    public Fraction reduce(){
        int x = this.numerator;
        int y = this.denominator;
        int t;

        while (y != 0){
            t = x % y;
            x = y;
            y = t;
        }
        numerator = numerator/x;
        denominator = denominator/x;
        return new Fraction(numerator,denominator);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
