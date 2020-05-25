//Author: Brendan Loyd
//Created: 3-1-2020
//Comp Sci 2261

//This program determines the quadratic equation of the values inputted by the user. ax^2 + bx + c form...

package project3classes;
import java.util.Scanner;
import java.text.DecimalFormat;

public class GetquadraticEq {
    public static void main(String[] args){

        DecimalFormat df2 = new DecimalFormat ("0.000000");
        Scanner input = new Scanner(System.in);                                         //Create Scanner object

        double[] array = new double[3];                                                 //Array object to hold a, b, c
                                                                                        //values
        System.out.println("Please enter a, b , c:");
        for(int i = 0; i < array.length; i++)                                           //Gather values from user
        array[i] = input.nextDouble();

        QuadraticEquation eQ1 = new QuadraticEquation(array[0], array[1], array[2]);    //create instance of Quadratic
        double discriminant = eQ1.getDiscriminant();                                    //Equation class

        if(discriminant > 0)                                                            //Check value of discriminant
            System.out.print("The equation has two roots: " +                           //BEFORE deciding what to do
                    df2.format(eQ1.getRoot1(discriminant)) + " and " + df2.format(eQ1.getRoot2(discriminant))); //Then print as necessary
        else if (discriminant == 0)
            System.out.print("The equation has one real root: " + eQ1.getRoot1(discriminant));
        else
            System.out.println("The equation has no real roots.");
    }

}
