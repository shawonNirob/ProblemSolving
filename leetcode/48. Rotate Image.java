//O(n^2)times and O(1)Space
package leetCode;

import java.util.Arrays;

public class RotateImage {
    public void rotateImage(int [][] matrix){
        //Transpose the matrix
        for(int i=0; i<matrix.length; i++){
            for(int j=i; j< matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse the rows
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix.length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int [] [] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        RotateImage cal = new RotateImage();
        cal.rotateImage(matrix);
        for (int j : matrix[0]) System.out.print(j + "\t");
        System.out.println();
        for (int j : matrix[1]) System.out.print(j + "\t");
        System.out.println();
        for (int j : matrix[2]) System.out.print(j + "\t");
        System.out.println();
        for (int j : matrix[3]) System.out.print(j + "\t");
        System.out.println();

    }
}
//


package leetCode;

import java.util.Arrays;

public class RotateImage {
    public void rotateImage(int [][] matrix) {
            int left = 0;
            // number of columns - 1,
            // also think, actual position of right
            int right = matrix.length - 1;

            while (left < right) {
                for (int i = 0; i < right - left; i++) {
                    int top = left;
                    int bottom = right;

                    int topLeft = matrix[top][left + i];

                    matrix[top][left + i] = matrix[bottom - i][left];

                    matrix[bottom - i][left] = matrix[bottom][right - i];

                    matrix[bottom][right - i] = matrix[top + i][right];

                    matrix[top + i][right] = topLeft;
                }
                left++;
                right--;
            }
        }

    public static void main(String[] args) {
        int [] [] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        RotateImage cal = new RotateImage();
        cal.rotateImage(matrix);
        for (int j : matrix[0]) System.out.print(j + "\t");
        System.out.println();
        for (int j : matrix[1]) System.out.print(j + "\t");
        System.out.println();
        for (int j : matrix[2]) System.out.print(j + "\t");
        System.out.println();
        for (int j : matrix[3]) System.out.print(j + "\t");
        System.out.println();

    }
}
//
