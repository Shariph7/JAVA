package IF_ELSE_CONDITION;

import java.util.Scanner;
// CONDITION -> n>0(for Positive Number!)
public class pos_or_negative{
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        n = s.nextInt();
        if (n>0) {
            System.out.println(n+" is Positive Number!");
        }
        else{
            System.out.println(n+"is Negative Number!");
        }
    }
}
