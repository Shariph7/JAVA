package IF_ELSE_CONDITION;

import java.util.Scanner;
// CONDITION -> n>0(for Positive Number!)
public class Eligible{
    public static void main(String[] args) {
        int age;
        Scanner eligible = new Scanner(System.in);
        System.out.println("Your age?: ");
        age = eligible.nextInt();
        if (age>=18) {
            System.out.println("You are Elgibile for Driving!");
        }
        else{
            System.out.println("You are not Eligible Yet!");
        }
    }
}
