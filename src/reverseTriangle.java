import java.util.Scanner;

public class reverseTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Enter row number: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= i; space++) {
                System.out.print(" ");
            }
            for (int star = ((2 * n)); star >= (2 * i); star--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
