// DISPLAYING BINARY NUMBER USING NESTED DO WHILE LOOP
public class Nested {
    public static void main(String[] args) {
        int i = 0, j = 0;
        do {
            do {
                System.out.println(i + ", " + j);
                j++;
            } while (j < 2);
            j = 0;
            i++;
        } while (i < 2);
    }
}