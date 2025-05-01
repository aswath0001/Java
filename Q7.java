
import java.util.Scanner;

public class Q7 {//fibonoci series   0,1,1,2,3,5,8.....
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int a =0;int b=1;int c;
        System.out.print("fibonoci numbers are:");
        for(int i=0;i<number;i++){
            System.out.print(" "+a);
        c=a+b;
        a=b;
        b=c;
        }
       
    }

}
