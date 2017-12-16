package com.company;

public class Main {

    public static void main(String[] args) {
        //2
        //téglalap példányosítás
        Rectangle rectangle = new Rectangle();
        //oldalak beállítása
        rectangle.setA(5);
        rectangle.setB(8);
        // terület és kerület kiíratás
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getArea());

        //háromszög példányosítás
        Triangle triangle = new Triangle();
        //oldalak beállítása
        triangle.setA(5);
        triangle.setB(15);
        triangle.setC(9);
        triangle.setBeta(40);
        // terület és kerület kiíratás
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
    }
}
