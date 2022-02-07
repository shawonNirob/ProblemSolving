package leetCode;

import java.util.Arrays;

public class MatrixRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
            if(check(mat,target)){
                return true;
            }
            else{
                for(int i=0; i<3; i++){
                    matrixrotate(mat);
                    if(check(mat,target)){
                        return true;
                    }
                }
        }return false;
    }
    public void matrixrotate( int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }
    }
    public boolean check(int [][]matrix, int [][] target){
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] != target[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }

    public static void main(String[] args) {
        int [][] matrix = {{0,0,0},{0,1,0},{1,1,1}};
        int [][] target = {{1,1,1},{0,1,0},{0,0,0}};
        MatrixRotation cal = new MatrixRotation();
        System.out.println(cal.findRotation(matrix, target));

    }
}
