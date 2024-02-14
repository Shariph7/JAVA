// WAP IN JAVA TO FIND THE SMALLEST NUMBER AMONG THREE NUMBERS USING NESTED IF ELSE STATEMENT.
import java.util.*;
public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a<b) {
            if (a<c) {
                System.out.println(a+" is the Smallest Number!");
            }
            else{
                System.out.println(c+" is the Smallest Number!");
            }
        }
        else{
            if (b<c) {
                System.out.println(b+" is the Smallest Number!");
            }
            else{
                System.out.println(c+" is the Smallest Number!");
            }
        }
    }
}