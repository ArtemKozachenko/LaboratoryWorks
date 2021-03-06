package org.nmu.sa15.kozachenko.lab2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MatrixManager matrixManager = new MatrixManager();
        Matrix matrix = matrixManager.createMatrix(3, 3);
        matrixManager.displayMatrix(matrix);
        System.out.println("sum is " + matrixManager.calculateMatrixSumOfElements(matrix) +
                ", min element is " + matrixManager.findMatrixMinimum(matrix) +
                ", max element is " + matrixManager.findMatrixMaximum(matrix));
    }
}
