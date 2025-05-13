
import java.util.Scanner;

public class Q11 {
    /*
     * fibonacci series
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int num1 =1;
        int num2 =0;
        int num3 = 0;
        if(A>0){
            System.out.print(0+" ");
        }
        for (int i = 0; i < A; i++) {
            num3 = num1+num2;
            System.out.print(num3+ " ");
            num1=num2;
            num2=num3;
        }
       
    }
}
