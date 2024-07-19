package anudip;

public class DemoStringBuilder {
    public static void main(String[] args) {
        // Creating a StringBuilder object with initial value "Java FullStack"
        StringBuilder sb = new StringBuilder("Java FullStack");
        
        // Printing the StringBuilder object
        System.out.println("String Builder:" + sb);
        
        // Printing the length of the StringBuilder object
        System.out.println(sb.length());
        
        // Finding the last occurrence of character 'k' in the StringBuilder object
        System.out.println(sb.lastIndexOf("k"));
        
        // Converting the StringBuilder object to a String
        String s = sb.toString();
        
        // Printing the String
        System.out.println("String:" + s);
        
        // Creating a StringBuffer object with the value of the String
        StringBuffer sb1 = new StringBuffer(s);
        
        // Printing the StringBuffer object
        System.out.println("String buffer:" + sb1);
    }
}
