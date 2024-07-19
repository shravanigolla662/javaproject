package anudip;

import java.util.ArrayDeque;

public class DequeueStr {

    public static void main(String[] args) {
        // Creating a new ArrayDeque to store strings
        ArrayDeque<String> sdeque = new ArrayDeque<>();
        
        // Adding elements to the deque
        sdeque.add("Abhi");    // Adds "Abhi" to the end of the deque
        sdeque.add("Mouni");   // Adds "Mouni" to the end of the deque
        sdeque.push("Anjali"); // Adds "Anjali" to the front of the deque
        sdeque.push("Manasa"); // Adds "Manasa" to the front of the deque
        sdeque.push("Dheeraj"); // Adds "Dheeraj" to the front of the deque
        sdeque.add("Jagan");   // Adds "Jagan" to the end of the deque
        sdeque.add("Venu");    // Adds "Venu" to the end of the deque
        
        // Printing the current state of the deque
        System.out.println(sdeque); 
        
        // Checking if "Sai" is in the deque
        System.out.println(sdeque.contains("Sai"));
        
        // Peeking at the first element of the deque (head of the deque)
        System.out.println(sdeque.peek()); // Prints: Dheeraj
        
        // Getting the first element of the deque without removing it
        System.out.println(sdeque.getFirst());
        
        // Getting the last element of the deque without removing it
        System.out.println(sdeque.getLast());
        
        // Printing the class of the deque
        System.out.println(sdeque.getClass()); 
        
        // Popping (removing) the first element from the deque
        sdeque.pop();
        System.out.println(sdeque); 
        
        // Polling (removing) the first element from the deque
        sdeque.poll();
        System.out.println(sdeque);
    }

}
