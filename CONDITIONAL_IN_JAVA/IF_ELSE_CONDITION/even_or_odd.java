package IF_ELSE_CONDITION;

import java.util.Scanner;
// CONDITION -> n>0(for Positive Number!)
public class even_or_odd{
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        n = s.nextInt();
        if (n%2==0) {
            System.out.println(n+" is Even Number!");
        }
        else{
            System.out.println(n+"is ODD Number!");
        }
    }
}
