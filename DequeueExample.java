package anudip;

import java.util.ArrayDeque;

public class DequeueExample {
    public static void main(String[] args) {
        // Creating a new ArrayDeque to store integers
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        
        // Adding elements to the deque
        deque.add(100); // Adds 100 to the end of the deque
        deque.push(200); // Adds 200 to the front of the deque
        deque.push(250); // Adds 250 to the front of the deque
        deque.push(95);  // Adds 95 to the front of the deque
        deque.push(176); // Adds 176 to the front of the deque
        deque.push(145); // Adds 145 to the front of the deque
        
        // Peeking at the first element of the deque 
        System.out.println("First element: " + deque.peek()); 
        
        // Removing the first element from the deque
        deque.remove(); 
        
        // Popping (removing) the first element from the deque
        deque.pop();
        
        // Printing the current state of the deque
        System.out.println(deque); 
        
        // Getting the first element of the deque without removing it
        System.out.println("First element: " + deque.getFirst()); 
        
        // Getting the last element of the deque without removing it
        System.out.println("Last element: " + deque.getLast());
        
        // Getting the current size of the deque
        System.out.println("Size of deque: " + deque.size()); 
        
        // Getting the first element of the deque again (still 95)
        System.out.println("First element: " + deque.getFirst());
        
        // Removing and returning the last element of the deque
        System.out.println("Removed last element: " + deque.removeLast());
        
        // Printing the current state of the deque after removing last element
        System.out.println(deque); 
        
        // Adding an element to the front of the deque
        deque.addFirst(50); 
        System.out.println(deque);
        
        // Adding an element to the end of the deque
        deque.addLast(750);
        System.out.println(deque);
    }
}
