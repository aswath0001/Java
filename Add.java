public class Add {
    /*int a =10;
    int b=20;

    void Addition(){
     System.out.println(a+b);
    }
  */
    int apple_price = 20;
    int apple_count =5;
    void money(){
        System.out.println("total money is:"+apple_count*apple_price);
    }
    public static void main(String[] args) {
        Add ob = new Add();
        ob.money();
    }
}
