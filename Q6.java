
import java.util.Scanner;

public class Q6 {// reverse a number
    public static void main(String[] args) {
        int temp =0;
        int rem =0;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
       while(num>0){
     rem=num%10;
      temp=temp*10+rem;
      num=num/10;
       }
       System.out.println(temp);
    }
}
