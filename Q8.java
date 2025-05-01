import java.util.Scanner;
//prime number
public class Q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Boolean res =false;
        for(int i =2;i<num ;i++){
         if(num%i==0){
            res=true;
         }
        }
        if(res==true){
            System.out.println("not prime");
         }
         else{
            System.out.println("prime");
         }
    }
}
