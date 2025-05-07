import java.util.Scanner;

public class Q9 {// print  prime numbers
    public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for(int i=2;i<num;i++){
           boolean check = false;
           for(int j=2;j<i;j++){
            if(i%j==0){
                check = true;
                break;
            }
           }
           if(check==false){
            System.out.print(" "+i);
           }
        }
    }
}
