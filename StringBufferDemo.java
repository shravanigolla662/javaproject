package anudip;

public class StringBufferDemo {
    // Inner class DemoStringBuffer
    public class DemoStringBuffer {

        // Main method
        public static void main(String[] args) {
            // Creating a StringBuffer object with initial value "Mounika"
            StringBuffer strbuff = new StringBuffer("Mounika");
            
            // Printing the StringBuffer object
            System.out.println(strbuff);
            
            // Appending "Reddy" to the StringBuffer object
            strbuff.append("Reddy");
            
            // Reversing the StringBuffer object and printing the result
            System.out.println(strbuff.reverse());
            
            // Getting the character at index 6 of the StringBuffer object and printing it
            System.out.println(strbuff.charAt(6));
            
            // Finding the index of the first occurrence of character 'y' in the StringBuffer object and printing it
            System.out.println(strbuff.indexOf("y"));
            
            // Printing the current capacity of the StringBuffer object
            System.out.println(strbuff.capacity());
            
            // Creating a new StringBuffer object with initial value "SHRAVANIGOLLA"
            StringBuffer strb = new StringBuffer("SHRAVANIGOLLA");
            
            // Printing the capacity of the StringBuffer object strbuff (which is from the previous StringBuffer object)
            System.out.println(strbuff.capacity());
            
            // Deleting the character at index 9 from the StringBuffer object strb and printing the result
            strb.deleteCharAt(9);
            System.out.println(strb);
            
            // Getting the Unicode code point at index 5 of the StringBuffer object strb and printing it
            System.out.println(strb.codePointAt(5));
        }
    }
}
