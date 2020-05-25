//Author: Brendan Loyd
//Created: 4-22-2020
//Comp Sci 2261

//This program finds the union, difference, and intersection of two LinkedHashSets.
package project5collectioninterface;
import java.io.*;

public class OperationsOnHashSet{
    public static void main(String [] args){

        //Create first linkedHashset
        java.util.LinkedHashSet<String> set1 = new java.util.LinkedHashSet<>();
        set1.add("George");
        set1.add("Jim");
        set1.add("John");
        set1.add("Blake");
        set1.add("Kevin");
        set1.add("Michael");

        //Create second LinkedHashSet
        java.util.LinkedHashSet<String> set2 = new java.util.LinkedHashSet<>();
        set2.add("George");
        set2.add("Katie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");

        //Create two clones of the first LinkedHashSet
        java.util.LinkedHashSet<String> set1Clone1 = (java.util.LinkedHashSet<String>)set1.clone();
        java.util.LinkedHashSet<String> set1Clone2 = (java.util.LinkedHashSet<String>)set1.clone();
        java.util.LinkedHashSet<String> set1Clone3 = (java.util.LinkedHashSet<String>)set1.clone();
        java.util.LinkedHashSet<String> set2Clone1 = (java.util.LinkedHashSet<String>)set2.clone();

        //Find union
        set1.addAll(set2);

        //Find difference
        set1Clone1.removeAll(set2);
        set1Clone2.removeAll(set1);
        set1Clone1.addAll(set1Clone2);

        //Find intersection
        set1Clone3.retainAll(set2);

        //Display the results
        System.out.println("The Union of the two sets is: " + set1);
        System.out.println("The Difference of the two sets is: " + set1Clone1);
        System.out.println("The intersection of the two sets is: " + set1Clone3);
    }
}
