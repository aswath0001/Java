import java.util.Scanner;
//count for number of even and odd number 
public class Q6 {
    public static void main(String[] args) {
        int Even = 0;
        int Odd =0;
        Scanner scan = new Scanner(System.in);
        for(int i =1;i<=5;i++){
            System.out.print("Enter a number:");
            int Num = scan.nextInt();
            if(Num%2==0){
          Even++;
            }else{
                Odd++;
            }
        }
        System.out.println("Even numbers are:"+ Even);
        System.out.println("Odd numbers are:"+ Odd);
    }
}
