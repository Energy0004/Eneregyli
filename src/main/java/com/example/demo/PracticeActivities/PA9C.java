package com.example.demo.PracticeActivities;

public class PA9C {
    public static void main(String[] args) {
        Integer[][] m1 = {{10, 5, 20}, {30, 6 ,40}, {50, 7, 60}};
        Integer[][] m2 = {{50, 8, 60}, {70, 8, 80}, {90, 10, 100}};
        IntegerMatrix integerMatrix = new IntegerMatrix();

        Number[][] m3 =  integerMatrix.addMatrix(m1, m2);
        System.out.println("m1 + m2 = ");
        IntegerMatrix.printResult(m1, m2, m3, '+');

        Number[][] m4 = integerMatrix.multiplyMatrix(m1, m2);
        System.out.println("m1 * m2 = ");
        IntegerMatrix.printResult(m1, m2, m4, '*');

        Integer min = integerMatrix.minMatrix(m1, m2);
        System.out.println("min value = " + min);
    }
}
class IntegerMatrix extends GenericMatrix<Integer> {
    @Override /** Add two integers */
    protected Integer add(Integer o1, Integer o2) {
        return o1 + o2;
    }
    @Override /** Multiply two integers */
    protected Integer multiply(Integer o1, Integer o2) {
        return o1 * o2;
    }
    @Override /** Specify zero for an integer */
    protected Integer zero() {
        return 0;
    }
}
abstract class GenericMatrix<E extends Number> {
    /** Abstract method for adding two elements of the matrices */
    protected abstract E add(E o1, E o2);
    /** Abstract method for multiplying two elements of the matrices */
    protected abstract E multiply(E o1, E o2);
    /** Abstract method for defining zero for the matrix element */
    protected abstract E zero();
    /** Add two matrices */
    public E minMatrix(E[][] matrix1, E[][] matrix2) {
        if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length)) {
            throw new RuntimeException("The matrices do not have the same size");
        }
        E min = matrix1[0][0];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                if (matrix1[i][j].doubleValue() < min.doubleValue()) {
                    min = matrix1[i][j];
                }
                if (matrix2[i][j].doubleValue() < min.doubleValue()) {
                    min = matrix2[i][j];
                }
            }
        }
        return min;
    }
    public Number[][] addMatrix(E[][] matrix1, E[][] matrix2) {
    // Check bounds of the two matrices
        if ((matrix1.length != matrix2.length) || (matrix1[0].length != matrix2[0].length)) {
            throw new RuntimeException("The matrices do not have the same size");
        }
        Number[][] result =  new Number[matrix1.length][matrix1[0].length];
        // Perform addition
        for (int i = 0; i < result.length; i++)
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = add(matrix1[i][j], matrix2[i][j]);
            }
        return result;
    }
    /** Multiply two matrices */
    public Number[][] multiplyMatrix(E[][] matrix1, E[][] matrix2) {
        // Check bounds
        if (matrix1[0].length != matrix2.length) {
            throw new RuntimeException("The matrices do not have compatible size");
        }
        // Create result matrix
        Number[][] result = new Number[matrix1.length][matrix2[0].length];
        // Perform multiplication of two matrices
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = zero();
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] = add((E) result[i][j], multiply(matrix1[i][k], matrix2[k][j]));
                }
            }
        }
        return result;
    }
    /** Print matrices, the operator, and their operation result */
    public static void printResult(
            Number[][] m1, Number[][] m2, Number[][] m3, char op) {
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                System.out.print(" " + m1[i][j]);
            }
            if (i == m1.length / 2){
                System.out.print(" " + op + " ");
            }else {
                System.out.print("  ");
            }
            for (int j = 0; j < m2.length; j++){
                System.out.print(" " + m2[i][j]);
            }
            if (i == m1.length / 2){
                System.out.print(" = ");
            }else
                System.out.print(" ");

            for (int j = 0; j < m3.length; j++){
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }
    }
}