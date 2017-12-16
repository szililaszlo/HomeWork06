package com.company;

public class Triangle extends AbstractShape {
    private float a;
    private float b;
    private float c;
    private float beta;

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getBeta() {
        return beta;
    }

    public void setBeta(float beta) {
        this.beta = beta;
    }

    @Override
    public float getArea() {
        //a Math.sin függvény double értéket ad, ezér át kell kasztolni, habár így az érték pontatlna lesz,
        //de mivel az UML  alapján a metódus float-ot ad vissza kénytelen voltam így megoldnai
        return (this.c*this.a* ( (float) Math.sin (this.beta) ) ) /2 ;
    }

    @Override
    public float getPerimeter() {
        return this.a+this.b+this.c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", beta=" + beta +
                '}';
    }
}
