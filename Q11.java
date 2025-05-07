
import java.util.Scanner;
//gcd of two numbers
public class Q11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        while (num2!=0){
       int temp = num2;
       num2=num1%num2;
       num1=temp;
        }
        System.out.println(num1);
    }
}
