import java.util.*;
import java.io.*;;
public class INPUT {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer Number!: ");
        a = sc.nextInt(); // Integer Input.
        System.out.println("Enter the Character: ");
        b = sc.next().charAt(0); // Character Input.

        // OUTPUT
        System.out.println("INTEGER: "+a);
        System.out.println("CHARACTER: "+b);
    }
}
