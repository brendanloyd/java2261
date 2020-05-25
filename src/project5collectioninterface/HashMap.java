//Author: Brendan Loyd
//Created: 4-25-2020
//Comp Sci 2261

//This Program creates a hashMap and then a treeMap, displays them, asks the user for input and checks to see if input
//is in treeMap.
package project5collectioninterface;
import java.util.*;

public class HashMap {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        //Create HashMap and add 15 states into it
        Map<String, String> hashMap = new java.util.HashMap<>();
        hashMap.put("Missouri", "Jefferson City");
        hashMap.put("Ohio", "Columbus");
        hashMap.put("Oregon", "Salem");
        hashMap.put("Texas", "Austin");
        hashMap.put("Utah", "Salt Lake City");
        hashMap.put("Mississippi", "Jackson");
        hashMap.put("Maine", "Augusta");
        hashMap.put("Kansas", "Topeka");
        hashMap.put("Idaho", "Boise");
        hashMap.put("Hawaii", "Honolulu");
        hashMap.put("Florida", "Tallahassee");
        hashMap.put("Arkansas", "Little Rock");
        hashMap.put("Alaska", "Juneau");
        hashMap.put("Arizona", "Phoenix");
        hashMap.put("Wyoming", "Cheyenne");

        //Create treeMap
        Map<String, String> treeMap = new java.util.TreeMap<>(hashMap);

        //Print out hashMap and treeMap
        System.out.println(hashMap);
        System.out.println(treeMap);

        //Get input from user
        System.out.println("Please enter the name of a state and I will check if its in the treeMap!: ");
        String userInput = input.nextLine();

        //check to see if key is present in treeMap
        if(treeMap.containsKey(userInput)){
            System.out.println("The capital of the state you entered is: " + treeMap.get(userInput));
        } else {
            System.out.println("Error! this state was not found in the treeMap...");
        }
    }
}
