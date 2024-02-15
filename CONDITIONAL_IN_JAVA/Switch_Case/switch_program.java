

import java.util.*;
public class switch_program {
    public static void main(String[] args) {
        int i,a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        i = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        switch (i) {
            case 1:
            i = a+b;
                System.out.println("Sum of a and b is "+i);
                break;
            case 2:
            i = a-b;
                System.out.println("Differences of a and b is "+i);
                break;
            case 3:
            i = a*b;
                System.out.println("Multiplication of a and b 9 is "+i);
                break;
            case 4:
            i = a/b;
                System.out.println("Division of a by b is "+i);
                break;
            default:
                System.out.println("Invalid Input!");
                break;
        }
    }
}