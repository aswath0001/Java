
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       int income = scan.nextInt();
       if(income>=7000){
        System.out.println("scholorship availabe");
       }else{
        System.out.println("not available");
       }
    }
}
