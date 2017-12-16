package com.company;

public class Rectangle extends AbstractShape {
    private float a;
    private float b;

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

    @Override
    public float getArea() {
        return this.a * this.b;
    }

    @Override
    public float getPerimeter() {
        return (this.a+this.b)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
