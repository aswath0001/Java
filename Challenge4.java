
import java.util.Scanner;



public class Challenge4 {

    /*void EvenOrOdd(int a){
      if( a%2==0){
        System.out.println("Even number");
      }else{
        System.out.println("odd number");
      }
    }
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner scan = new Scanner(System.in);
        Challenge4 obj = new Challenge4();
        obj.EvenOrOdd(scan.nextInt());
    }*/

    String PassOrfail(int Tmark){
       if(Tmark>=35){
       return "pass";
       }else{
        return "fail";
       }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Challenge4 obj = new Challenge4();
        int mark = scan.nextInt();
        String Result = obj.PassOrfail(mark);
        System.out.println(Result);
    }
}
