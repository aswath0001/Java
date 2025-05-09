
import java.util.Scanner;
//binary to decimal conversion
/*
 * number before decimal conversion   14
 * 14/2==>7 rem=0;
 * 7/2==> rem=1;
 * 3/2==> rem=1;
 * 1
 * so 1110
 * 0*2 pow 0 = 0
 * 1*2 pow 1 = 2
 * 1*2 pow 2 = 4
 * 1*2 pow 3 = 8  = 2+4+8 = 14 
 * 
 * now for 15
 * 15/2==>7 rem=1
 * 7/2 ==>3 rem=1
 * 3/2 ==> 1 rem=1
 * rem =1
 * 1111
 * 1*2 pow 0 =1
 * 1*2 pow 1 = 2
 * 1*2 pow 2 = 4
 * 1* 2 pw 3 = 8
 * 1+2+4+8=15
 */
public class Q9 {
    public static void main (String []args){
      Scanner scan=  new Scanner(System.in);
      int number = scan.nextInt();
      int rem=0;
      int count =0;
      double temp=0;
      for(int i=0;i<=5;i++){
        rem=number%10;
       double product = rem * Math.pow(2, count);
       count++;
       temp=product+temp;
       number=number/10;
      }
      int result = (int)temp;
    System.out.println(result);
    }
}
