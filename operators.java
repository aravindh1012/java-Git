import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // This will print the sum of the ASCII values of 'a' and 'b'
        System.out.println("a" + "b"); // This will concatenate the two strings "a" and "b"
        System.out.println('a' + 1); // This will print the sum of the ASCII value of 'a' and 1, which is 98
        System.out.println("a" + 1); // This will concatenate the string "a" with the number 1, resulting in "a1"
        System.out.println((char)('a'+3)); // This will add 3 to the ASCII value of 'a' and cast it back to a character, resulting in 'd'
        // + is expression in jjava only use in premitive data types and strings
        // atleast one of the operands should be a string for concatenation to occur otherwise it will perform arithmetic addition
        System.out.println(new Integer(50) + " " + new ArrayList<>()); // This will print the string representation of the Integer object and an empty ArrayList object
        // The + operator is overloaded in Java for both arithmetic addition and string concatenation.
    }

}
