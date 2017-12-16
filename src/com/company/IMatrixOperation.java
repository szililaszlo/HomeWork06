package com.company;

public interface IMatrixOperation {

    public void printMatrix(int[][] matrix);

    public int[][] initMatrixWithRandomNumbers(int n, int m, int min, int max);

    public int[][] multiplyWithScalar(int number, int[][] matrix);

    public int[][] sum(int [] matrix1, int[][] matrix2);

}
