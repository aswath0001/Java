
import java.util.Scanner;
/*  Reverse a number

 * Reverse a number
 * number = 2345
 * rem = 2345%10 = 5
 * result = 0*10+5 = 5
 * num=2345/10 = 234
 * 
 * rem = 234%10 = 4
 * result = 5*10+4 = 54
 * num=234/10 = 23
 * 
 * rem = 23%10 = 3
 * result = 54*10+3 = 543
 * num=23/10 = 2
 * 
 * rem = 2%10 = 2
 * result = 543*10+2 = 5432
 * num=2/10 = 0
 */
public class Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rem = 0;
        int result = 0;
        for(int i=1;i<=5;i++){
            rem=num%10;
          result = result*10+rem;
          num=num/10;
        }
        System.out.println(result);
    }
}
