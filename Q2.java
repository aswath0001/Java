
import java.util.Scanner;

public class Q2 {// greatest of n umbers
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        int b = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("enter number:");
            int a = Scan.nextInt();  
            if(a>b){
                b=a;
            }else{
                b=b;
            }
        }
    System.out.println(b);
    }
    }

