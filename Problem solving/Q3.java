import java.util.Scanner;
//greatest ammong two numbers
public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    System.out.print("Enter first number:");
    int A = scan.nextInt();
    System.out.print("Enter Second number:");
    int B = scan.nextInt();
    if(A>B){
        System.out.println("A is the greatest number");
    }else if (A<B) {
        System.out.println("B is the greatest number");
    }else{
        System.out.println("A is equal to B");
    }
    }
}
