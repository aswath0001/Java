
import java.util.Scanner;

public class Q3 {
    //count even number
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int odd = 0;
        int even =0;
        for(int i=0;i<=5;i++){
            System.out.print("enter number:");
            int a = scan.nextInt();
            if(a%2==0){
                even =even+1;
            }else{
                odd =odd+1;
            }
        }
        System.out.println(odd);
        System.out.println(even);
    }
   
}
