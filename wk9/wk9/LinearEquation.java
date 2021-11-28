// Assignment 9.11 - Linear Equation class
// this class will find the intersecting points in Java
package wk9;

public class LinearEquation {
    /* ~ Feilds ~ */
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    /* ~ Constuctor ~ */
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        // [9.0, 4.0, 3.0, -5.0, -6.0, -21.0]

    }

    /* ~ Setters ~ */
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setD(double d) {
        this.d = f;
    }

    public void setE(double e) {
        this.e = e;
    }

    public void setF(double f) {
        this.f = f;
    }

    /* ~ Getters ~ */
    public double getA() {
        return a;
    }

    public double getb() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    /* ~ Computations ~ */
    private double adbc(){
        return a * d - b * c;
    }

    public double getX() {
        return (e * d - b * f) / adbc();
    }

    public double getY() {
        return (a * f - e * c) / adbc();
    }

    public boolean isSolvable(){
        return adbc() != 0;
    }


}
