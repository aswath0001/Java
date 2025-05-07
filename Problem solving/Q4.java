import java.util.Scanner;
//greatest of 3 numbers
public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    System.out.print("Enter first number:");
    int A = scan.nextInt();
    System.out.print("Enter Second number:");
    int B = scan.nextInt();
    System.out.print("Enter Third number:");
    int C = scan.nextInt();
   if(A>B){
      if(A>C){
        System.out.println("A is greater");
      }else if(A<C){
        System.out.println("C is greater");
      }else{
        System.out.println("A is equal to C");
      }
   }else if(B>A){
    if(B>C){
        System.out.println("B is greater");
      }else if(B<C){
        System.out.println("C is greater");
      }else{
        System.out.println("A is equal to B");
      }
   }else {
    System.out.println("A is equal to B");
   }
    }
}
