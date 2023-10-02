import java.util.Scanner;

public class EuclideanAlgorithm {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer (b): ");
        int b = scanner.nextInt();

        int gcdResult = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is " + gcdResult);

        scanner.close();
    }
}
