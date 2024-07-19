package anudip;

import java.util.StringTokenizer;

public class DemoStringTokenizer {

    public static void main(String[] args) {
        // Creating a StringTokenizer object with input string and delimiter
        StringTokenizer st = new StringTokenizer("Java Full-Stack using Angular", " ", false);
        
        // Count and print number of tokens (words)
        System.out.println(st.countTokens());

        // Iterate through tokens and print each token
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        // Attempting to convert StringTokenizer to string (not meaningful)
        String s = st.toString();
        System.out.println(s);
    }

}
