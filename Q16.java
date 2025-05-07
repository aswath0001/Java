
import java.util.Scanner;
//factorial
public class Q16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int temp = 1;
        for (int i = 1; i <= N; i++) {
             temp = temp*i;
        }
        System.out.println(temp);
    }
}
