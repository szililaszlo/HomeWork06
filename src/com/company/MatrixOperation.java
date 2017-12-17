package com.company;

public class MatrixOperation implements IMatrixOperation {

    //mátrix kiíratás, nem a feladat része, de megkönnyíti az ellenőrzést
    @Override
    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //nem funkiconál
    @Override
    public int[][] initMatrixWithRandomNumbers(int n, int m, int min, int max) {
        return new int[0][];
    }


    //4
    //mátrix szorzás
    @Override
    public int[][] multiplyWithScalar(int number, int[][] matrix) {
        //létrehozk egy , a z eredetivel megegyező mátrixot
        int newMatrix[][] = matrix;
        //végigmegyek az elemein
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //minden régi elem a bekért skalárral való szorzás után új értékével az újonnan létrehozott mátrix
                //azonos poziciójába kerül
                newMatrix[i][j] = matrix[i][j] * number;
            }
        }
        //visszatér az új mátrixal, a régi érintetlen marad
        return newMatrix;
    }

    //nem funkcionál
    @Override
    public int[][] sum(int[] matrix1, int[][] matrix2) {
        return new int[0][];
    }
}
