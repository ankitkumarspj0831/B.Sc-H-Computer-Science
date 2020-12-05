import java.lang.Math;

public class stringMethods {
    public static void main(final String args[]) {
        // Split Method
        final String name = "Ankit Kumar";
        final String array1[] = name.split(" ");
        System.out.println("First name: " + array1[0]);
        System.out.println("Second name: " + array1[1]);
        // CopyValueOf Method
        char[] mystr1 = { 'a', 'p', 'p', 'l', 'e'};
        String mystr2="";
        mystr2 = String.copyValueOf(mystr1, 0, 5);
        System.out.println("Word is: " + mystr2);
        // Format Method
        System.out.println(String.format("The value of PI is: %.6f ", Math.PI));
        // Replace Method
        String ab = "aaabbb";
        System.out.println("The replaced string is: " + ab.replace('a','b'));
        // Substring Method
        String s = "Delhi University";
        System.out.println(s.substring(0,5));
        // Trim Method
        String s1 = "    Delhi University   ";
        System.out.println("Before Trim Method: " + s1);
        System.out.println("After Trim Method: " + s1.trim());
        // Join Method
        String join = String.join(".", "Life", "is", "awesome");
        System.out.println(join);
    }
}
