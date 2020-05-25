//Author: Brendan Loyd
//Created: 2-21-2020
//Comp Sci 2261

//This program compares to arrays to check if they are identical. Enjoy!
package project1andproject2generallogic;
import java.util.Scanner;
import java.util.Arrays;

public class identicalArray {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);                         //Scanner object

        System.out.println("What are the size of your arrays?: ");      //Find size of array

        int size = input.nextInt();
        int[] a1 = new int[size];
        int[] a2 = new int[size];

            System.out.println("Please enter the values2 for the first array:");
        for(int i = 0; i < a1.length; i++){                             //Get input for first array
            a1[i] = input.nextInt();
        }

        System.out.println("Please enter the values for the second array:");
        for(int j = 0; j < a1.length; j++){                             //Get input for second array
            a2[j] = input.nextInt();
        }

        boolean same = equals(a1, a2);                                  //Call method to check if identical or not

        if(same)                                                //If condition to check result and print correct
        System.out.println("Two lists are identical.");                 //statement.
        else
            System.out.println("Two lists are not identical.");

    }
    public static boolean equals(int[] a1, int[]a2){                   //Method checking equals

        Arrays.sort(a1);                                               //Sort both arrays
        Arrays.sort(a2);

        for(int i = 0; i < a1.length; i++){                            //cycle through arrays to check equals
            if(a1[i] != a2[i]){
                return false;
            }
        }
        return true;                                                   //Return result
    }
}
