// TO CHECK THE GIVEN LETTER CONTAINS WHITESPACE, UPPERCASE, LOWERCASE OR NONE OF THEM.
package IF_ELSE_IF_CONDITION;
import java.io.*;
import java.util.*;
public class letter {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);

        if (Character.isUpperCase(ch)) {
            System.out.println(" Uppercase Characater");
        }
        else if (Character.isLowerCase(ch)) {
            System.out.println(" LowerCase Characater");
        }
        else if (Character.isWhitespace(ch)) {
            System.out.println(" Contains WhiteSpace");
        }
        else{
            System.out.println("SIMPLE TEXT!");
        }
    }
}
