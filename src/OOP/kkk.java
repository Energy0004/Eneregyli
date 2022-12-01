package OOP;

import java.util.*;
class MyMatrix{

    private int ro;
    private int co;
    private int va;
    private int[][] g;
    public MyMatrix(int ro_,int co_){
        ro = ro_;
        co = co_;
        g = new int [ro_][co_];
    }
    public void set(int ro, int co, int va){
        g[ro][co] = va;
    }
    public int get(int ro,int co){
        return g[ro][co];
    }
    public int totalSum(){
        int s = 0;
        for(int i = 0; i < ro; i++)
            for(int j = 0; j < co; j++){
                s += g[i][j];
            }
        return s;
    }
}
public class kkk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        MyMatrix matrix = new MyMatrix(row, col);  // size of matrix

        int n = in.nextInt(); // number of "set" commands
        int value;            // value to be saved in the matrix
        for(int i=0; i<n; i++){
            row = in.nextInt();
            col = in.nextInt();
            value = in.nextInt();
            matrix.set(row, col, value); // set the value at specific location
        }

        n = in.nextInt();     // number of "get" commands
        for(int i=0; i<n; i++){
            row = in.nextInt();
            col = in.nextInt();
            System.out.println(matrix.get(row, col)); // print the value at specific location
        }

        System.out.println(matrix.totalSum()); // print the total sum of all the elements of the matrix
    }
}