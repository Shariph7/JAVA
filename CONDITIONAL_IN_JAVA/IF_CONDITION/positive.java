package IF_CONDITION;

import java.util.Scanner;
// CONDITION -> n>0(for Positive Number!)
public class positive {
    public static void main(String[] args) {
        int n;
        Scanner pos = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        n = pos.nextInt();
        if (n>0) {
            System.out.println(n+" is Positive Number!");
        }
    }
}
