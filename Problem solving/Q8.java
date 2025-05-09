import java.util.Scanner;

public class Q8 {
    //sum of the digits  in a number
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        int A = scan.nextInt();
        int sum = 0;
        int rem =0;
        while(A>0){
            rem=A%10;
            sum=sum+rem;
            A=A/10;
        }
        System.out.println(sum);
    }
}
