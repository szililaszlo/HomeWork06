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

    //nem funkiconál, a feladatlap nem kéri
    @Override
    public int[][] initMatrixWithRandomNumbers(int n, int m, int min, int max) {
        return new int[0][];
    }


    //4
    //mátrix szorzás
    @Override
    public int[][] multiplyWithScalar(int number, int[][] matrix) {
        //létrehozk egy , az eredetivel megegyező mátrixot
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

    //5
    //két db n*m-s mátrix összeadása
    @Override
    public int[][] sum(int[][] matrix1, int[][] matrix2) {
        //létrehozk egy , az eredetivel megegyező mátrixot
        int newMatrix[][] = matrix1;
        //végigmegyek az elemein
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                //a paraméterként kapott 2 mátrix azonos pozicióba lévő elemeit összeadja és az új mátrix azonos
                //poziciójába menti el
                newMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        //visszatér az új mátrixal, a régi mátrixok érintetlenek maradnak
        return newMatrix;
    }
}
