// WAP TO FIND THE GREATEST NUMBER AMONG THREE NUMBERS.
package IF_ELSE_IF_CONDITION;
import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a>b && a>c) {
            System.out.println(a+"is Greatest Number!");
        }
        else if (b>a && b>c) {
            System.out.println(b+"is Greatest Number!");
        }
        else{
            System.out.println(c+"is Greatest Number!");
        }
    }
}
