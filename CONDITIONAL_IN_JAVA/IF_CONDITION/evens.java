// EVEN
package IF_CONDITION;
import java.util.Scanner;
// CONDITION -> n%2 == 0(for Even!)
public class evens {
    public static void main(String[] args) {
        int e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        e = sc.nextInt();
        if (e%2==0) {
            System.out.println(e+" is Even Number!");
        }
    }
}