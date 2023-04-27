
import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();
        
        int triangleNumber = 0;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            triangleNumber += i;
            factorial *= i;
        }

        System.out.println("The " + n + "-th triangle number is " + triangleNumber);
        System.out.println("The factorial of " + n + " is " + factorial);
    }
}
