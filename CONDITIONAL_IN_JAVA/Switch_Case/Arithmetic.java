import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        int i,a,b;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        switch (i) {
            case 1:
            i = a+b;
                System.out.println("Sum is "+i);
                break;
            case 2:
                System.out.println("Febraury!");
                break;
            case 3:
                System.out.println("March!");
                break;
            case 4:
                System.out.println("April!");
                break;
            case 5:
                System.out.println("May!");
                break;
            case 6:
                System.out.println("June!");
                break;
            case 7:
                System.out.println("July!");
                break;
            case 8:
                System.out.println("August!");
                break;
            case 9:
                System.out.println("September!");
                break;
            case 10:
                System.out.println("October!");
                break;
            case 11:
                System.out.println("Novemner!");
                break;
            case 12:
                System.out.println("December!");
                break;
            default:
            System.out.println("Invalid Input!");
                break;
        }
    }
}
