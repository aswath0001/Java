import java.util.Scanner;

public class Q4 {//number of even digitse4
     public static void main(String[] args) {
        int count = 0;
        int rem =0;
        Scanner scan = new Scanner(System.in);
      
        System.out.print("enter number:");
            int a = scan.nextInt();
      
        for(int i=1;i<=5;i++){
            rem =a%10;
            if(rem%2==0){
               count++;
            }
            a=a/10;
        }
       System.out.println(count);
    }
}
