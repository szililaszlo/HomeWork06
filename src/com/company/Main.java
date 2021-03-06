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

        //4
        //teszt mátrix
        int testMatrix[][] = {{1, 8, -3}, {4, -2, 5}};
        //példányosítás
        MatrixOperation matrixOperation = new MatrixOperation();
        //függvényhívás, ellenőrzés céljából
        matrixOperation.printMatrix(matrixOperation.multiplyWithScalar(2, testMatrix));

        //5
        //teszt mátrixok
        int sumMatrix1[][] = {{1, 3, 2}, {1, 0, 0}, {1,2,2}};
        int sumMatrix2[][] = {{0, 0, 5}, {7, 5, 0},{2,1,1}};
        //függvényhívás, ellenőrzés céljából
        matrixOperation.printMatrix(matrixOperation.sum(sumMatrix1,sumMatrix2));
    }
}
