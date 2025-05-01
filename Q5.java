import java.util.Scanner;

public class Q5 {//sum of the numbers 
     public static void main(String[] args) {
        int temp = 0;
        int rem =0;
        Scanner scan = new Scanner(System.in);
      
        System.out.print("enter number:");
            int a = scan.nextInt();
      
        for(int i=1;i<=5;i++){
            rem =a%10;
           temp = rem+temp;
            a=a/10;
        }
       System.out.println(temp);
    }
}

