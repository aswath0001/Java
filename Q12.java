import java.util.Scanner;   
// LCM and GCD calculation
public class Q12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        // Save original numbers for LCM calculation
        int a = num1;
        int b = num2;

        // GCD using Euclid's algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;
        int lcm = (num1 * num2) / gcd;

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}
