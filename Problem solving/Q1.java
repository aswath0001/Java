
import java.util.Scanner;


//Swapping two numbers
public class Q1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter first number:");
    int A = scan.nextInt();
    System.out.print("Enter Second number:");
    int B = scan.nextInt();
    int C;

    C=A;
    A=B;
    B=C;
    System.out.println(A);
    System.out.println(B);
  }  
}
