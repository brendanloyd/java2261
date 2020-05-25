//Author: Brendan Loyd
//Created: 2-21-2020
//Comp Sci 2261

//This program computes the GCD of 5 random integers input by the user. Enjoy!
package project1andproject2generallogic;
import java.util.Scanner;

public class gcd {
    public static void main(String[] args){

        int[] numbers = new int[5];                                 //Array to hold integers
        Scanner input = new Scanner(System.in);                     //Scanner object

        for(int i = 0; i < numbers.length; i++) {                   //Get numbers from user
            System.out.println("Please enter int " + (i + 1));
            numbers[i] = input.nextInt();
        }
        int result = gcd(numbers[0], numbers[1]);                   //Call method to get GCD and store result
        for(int j = 2; j < numbers.length; j++){
            result = gcd(result, numbers[j]);
        }

        System.out.println(" GCD of the numbers is: " + result);    //Print result
    }
    public static int gcd(int a , int b){                           //Method to find GCD
        int gcd = 0;

        while (b > 0){                                              //Logic to find GCD
            int temp = b;
            b = a % b;
            a = temp;
            gcd = a;
        }

        return gcd;                                                 //Returning the GCD
    }
}
