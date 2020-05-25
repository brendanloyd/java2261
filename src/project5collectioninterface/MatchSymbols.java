//Author: Brendan Loyd
// Created: 4-17-2020
//Comp Sci 2261

//This program uses the stack object to match symbols from input string
package project5collectioninterface;
import java.util.*;
public class MatchSymbols {

    public static void main(String [] args){
        String userInput;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a group of symbols:");
        userInput = scan.next();

        if(checkBrackets(userInput))
            System.out.print(checkBrackets(userInput) + ": This string has proper grouping brackets.");
        else
            System.out.print(checkBrackets(userInput) + ": This string doesn't have proper brackets.");

    }

    public static boolean checkBrackets(String userInput) {
        Stack<Character> charStack = new Stack<>();
        for (int i = 0; i < userInput.length(); i++){
            Character currentChar = userInput.charAt(i);
            if (currentChar == '(' || currentChar == '{' || currentChar == '[' ) {
                charStack.push(currentChar);
            } else if (currentChar == ')' || currentChar == '}' || currentChar == ']' ) {
                Character lastBracket = charStack.peek();
                if (lastBracket == '(' && currentChar == ')' ||
                        lastBracket == '{' && currentChar == '}' ||
                            lastBracket == '[' && currentChar == ']') {
                    charStack.pop();
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
