import java.util.Scanner;
//swapping 2 numbers without 3 rd variable
public class Q2 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
    System.out.print("Enter first number:");
    int A = scan.nextInt();
    System.out.print("Enter Second number:");
    int B = scan.nextInt();
    A=A+B;
    B=A-B;
    A=A-B;
    System.out.println(A);
    System.out.println(B);
    }
}
