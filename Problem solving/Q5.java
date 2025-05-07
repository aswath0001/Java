
import java.util.Scanner;
//greatest of n numbers
public class Q5 {
    public static void main(String[] args) {
        int B =0;
        Scanner scan = new Scanner(System.in);
        for(int i =1;i<=5;i++){
            System.out.print("Enter a number:");
            int A = scan.nextInt();
            if(A>B){
                B=A;
            }
        }
        System.out.println("The greatest number is: " + B);
    }
}
