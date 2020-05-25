//Author: Brendan Loyd
//Created: 2-21-2020
//Comp Sci 2261

//This program finds the sum of the major diagonal of a matrix. Enjoy!
package project1andproject2generallogic;
import java.util.Scanner;

public class majorDiagonal {
    public static void main(String[] args) {

        double[][] matrix = new double[4][4];                           //Create matrix
        Scanner input = new Scanner(System.in);                         //Scanner object

        System.out.println("Please enter a 4x4 matrix row by row:");
        for (int i = 0; i < matrix.length; i++) {                       //Get input from user for matrix
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        System.out.println("Sum of the major diagonal is: " + sumMajorDiagonal(matrix));     //Find and print results
    }

    public static double sumMajorDiagonal(double[][] matrix) {          //Method that finds sum of the Major D of
        double sum = 0;                                                 //the matrix

        for (int i = 0, j = 0; i < matrix.length; i++, j++) {
                sum += matrix[i][j];
        }

        return sum;                                                     //Return result
    }
}