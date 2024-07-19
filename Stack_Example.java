package anudip;

import java.util.Stack;

public class Stack_Example {
    public static void main(String args[]) {
        // Create a stack to hold city names with their literacy rates
        Stack<String> cityStack = new Stack<>();

        // Adding cities with their literacy rates to the stack
        cityStack.push("Delhi:78.9%");
        cityStack.push("Andhra Pradesh:87.9%");
        cityStack.push("Telangana:85%");
        cityStack.push("Maharashtra:87.2%");
        cityStack.push("Tamil Nadu:91%");
        cityStack.push("Uttar Pradesh:82%");
        cityStack.push("Kerala:97.4%");
        
        // Displaying values in the stack
        System.out.println("Values in Stack:");
        for (int i = 0; i < cityStack.size(); i++) {
            System.out.println(cityStack.get(i));
        }
        
        // Retrieving top city in literacy rate 
        System.out.println("Top city in literacy rate: " + cityStack.peek());
        
        // Searching for the position of 'Telangana' in the stack
        System.out.println("Position of 'Telangana' in stack: " + cityStack.search("Telangana:85%"));

    }
}
