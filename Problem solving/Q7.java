import java.util.Scanner;
// number of even and odd digit in a number
public class Q7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int rem =0;
        int evenDigit=0;
        int oddDigit =0;
        while(num>0){
         rem=num%10;
         if(rem%2==0){
          evenDigit++;
         }else{
         oddDigit++;
         }
         num=num/10;
        }
        System.out.println("number of even digits are:"+ evenDigit);
        System.out.println("number of odd digits are:"+ oddDigit);
    }
}
