package anudip;

public class DemoString {

    public static void main(String[] args) {
        // String Declaration
        String name = "Shravani";
        System.out.println(name);

        // Defining String using constructor
        String course = new String("MCA");
        System.out.println(course);

        char[] courseType = {'a', 'w', 's'};
        // Defining string using character array
        String course1 = new String(courseType);
        System.out.println(course1);

        // Concatenating strings
        System.out.println(name.concat(" Foundation"));

        // Changing the value of 'name'
        name = "Anudip Foundation";

        // Accessing a character at a specific index
        System.out.println(name.charAt(15));

        // Finding the index of a specific character
        System.out.println(name.indexOf('n'));

        // Finding the last index of a specific character
        System.out.println(name.lastIndexOf('n'));

        // Finding the length of the string
        System.out.println(name.length());

        // Checking if 'name' contains the string 'course'
        System.out.println(name.contains(course));

        // Comparing strings
        System.out.println(name.equals(course1));

        // Comparing strings lexicographically
        String name1 = "anudip foundation";
        System.out.println(name.compareTo(course1));
        System.out.println(name.compareTo(name1));

        // Comparing strings ignoring case
        System.out.println(name.compareToIgnoreCase(name1));
        System.out.println(name.equalsIgnoreCase(name1));

        // Converting strings to uppercase
        System.out.println(name.toUpperCase());
        System.out.println(course1.toLowerCase());
    }
}
