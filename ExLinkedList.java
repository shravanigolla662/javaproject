package anudip;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExLinkedList {

    public static void main(String[] args) {
        // Creating a LinkedList of Doubles
        List<Double> list1 = new LinkedList<Double>();

        // Adding elements to the LinkedList
        list1.add(346.78);
        list1.add(1800.7);
        list1.add(908.7);
        list1.add(305.6);
        list1.add(109.78);

        // Printing the LinkedList
        System.out.println(list1);

        // Printing the size of the LinkedList
        System.out.println("Size of list1: " + list1.size());

        // Removing an element from the LinkedList by index
        System.out.println("Removed element at index 0: " + list1.remove(0));

        // Using Iterator to iterate through the LinkedList
        Iterator<Double> itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Finding the maximum and minimum values in the LinkedList using Collections
        System.out.println("Max value: " + Collections.max(list1));
        System.out.println("Min value: " + Collections.min(list1));

        // Sorting the LinkedList in natural order using Collections.sort()
        Collections.sort(list1);
        System.out.println("Sorted list: " + list1);

        // Reversing the order of elements in the LinkedList using Collections.reverse()
        Collections.reverse(list1);
        System.out.println("Reverse order: " + list1);
    }

}
