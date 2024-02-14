package IF_CONDITION;

import java.util.Scanner;
// CONDITION -> n<0(for Negative!)
public class negative {
    public static void main(String[] args) {
        int n;
        Scanner neg = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        n = neg.nextInt();
        if (n<0) {
            System.out.println(n+" is Negative Number!");
        }
    }
}
