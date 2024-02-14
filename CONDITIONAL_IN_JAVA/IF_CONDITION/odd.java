package IF_CONDITION;

import java.util.Scanner;
// CONDITION -> n%2 != 0(for ODD!)
public class odd {
    public static void main(String[] args) {
        int e;
        Scanner odd = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        e = odd.nextInt();
        if (e%2!=0) {
            System.out.println(e+" is ODD Number!");
        }
    }
}
