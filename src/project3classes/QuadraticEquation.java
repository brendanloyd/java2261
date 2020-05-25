//Author: Brendan Loyd
//Created: 3-1-2020
//Comp Sci 2261

//This file contains the class for Quadratic Equation and determines how the user can interact with the class.

package project3classes;

public class QuadraticEquation {                                //Public class for QuadraticEquation
    private double a , b , c;                                   //Private variables

    QuadraticEquation(double newA, double newB, double newC)    //Arg constructor
    {a = newA; b = newB; c = newC;}

    public double getA(){return a;}                             //Getter methods
    public double getB(){return b;}
    public double getC(){return c;}

    public double getDiscriminant()                             //Getter method to determine discriminant
    { return (Math.pow(b, 2) - 4 * a * c); }

    public double getRoot1(double discrim)                      //Getter method for first root if applicable
    { return (-b + Math.sqrt(discrim)) / (2*a); }

    public double getRoot2(double discrim)                      //Getter method for second root if applicable
    { return (-b - Math.sqrt(discrim)) / (2*a); }
}
