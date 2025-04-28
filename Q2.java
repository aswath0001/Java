public class Q2 {
    public static void main(String[] args) {

 for(int j =0;j<=3;j++){
    /*
     * iteration1
     * j=0; i=0 i<=0
     * *
     *  iteration2
     * j=1,i=0,i<=1
     * * j=1,i=1
     * **
     */
        for(int i=0; i<=j;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
