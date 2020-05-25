//Author : Brendan Loyd
//Project 1
//Created: 2-4-2020
//Comp Sci 2261

// This program determines if two circles exists inside, overlap, or apart from eachother

package project1andproject2generallogic;
import java.util.Scanner;
import java.lang.Math;

public class Geometry {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in); //Create scanner and get input from user
        System.out.println("Enter x coordinate, y coordinate, and radi of circle 1:");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double rad1 = input.nextDouble();

        System.out.println("Enter x coordinate, y coordinate, and radi of circle 2:"); // get input for 2nd circle
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double rad2 = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)); // calculate distance

        if (distance <= rad1 - rad2) // determine where the circles lie respective to one another and print outcome
            System.out.println("Circle 2 is inside circle 1!");
        else if (distance <= rad1 + rad2)
            System.out.println("Circle 2 overlaps circle 1!");
        else
            System.out.println("Circle 1 and 2 are neither within each other or overlapping");

    }
}
