// WAP IN JAVA TO FIND THE GREATEST NUMBER AMONG THREE NUMBERS USING NESTED IF ELSE STATEMENT.
import java.util.*;
public class Gretest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a>b) {
            if (a>c) {
                System.out.println(a+" is the Greatest Number!");
            }
            else{
                System.out.println(c+" is the Greatest Number!");
            }
        }
        else{
            if (b>c) {
                System.out.println(b+" is the Greatest Number!");
            }
            else{
                System.out.println(c+" is the Greatest Number!");
            }
        }
    }
}