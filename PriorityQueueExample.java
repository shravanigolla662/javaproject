package anudip;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Creating a PriorityQueue of integers
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        pq.add(10); // Adds 10
        pq.add(70); // Adds 70
        pq.add(30); // Adds 30
        
        // Removing the head of the PriorityQueue (returns the removed element)
        pq.poll(); 
        
        // Adding another element to the PriorityQueue
        pq.add(40);
        
        // Adding yet another element to the PriorityQueue
        pq.add(50); 
        
        // Printing the current state of the PriorityQueue
        System.out.println("PriorityQueue: " + pq); 
        
        // Retrieving, but not removing, the head of the PriorityQueue
        System.out.println("Peek: " + pq.peek()); 
        
        // Checking if the PriorityQueue is empty
        System.out.println("Is empty: " + pq.isEmpty()); 
        
        //Printing the size of the PriorityQueue
        System.out.println("Size " + pq.size());
        
     // Retrieving the element at the head of the PriorityQueue
        System.out.println("Element at head: "+pq.element());
    }

}
